package Plataforma;

import Compra.Credito;
import Compra.Pagamento;
import Compra.Pix;
import Compra.TipoPagamento;
import java.util.ArrayList;


public class CarrinhoCompra {
    private Usuario usuario;
    private ArrayList<Jogo> carrinho = new ArrayList<>();

    public CarrinhoCompra (Usuario usuario) {
        this.usuario = usuario;
    }

    public float valorTotal() {
        float total = 0;

        for (Jogo jogo: carrinho) {
            total += jogo.getPreco();
        }
        return total;
    }

    public void adicionarItem (Jogo jogo) {
        carrinho.add(jogo);
        System.out.println("-> " + jogo.getNome() + " foi adicionado ao carrinho de " + usuario.getNome() + ".");
    }

    public void removerItem (Jogo jogo) {
        carrinho.remove(jogo);
        System.out.println("-> " + jogo.getNome() + " foi removido do carrinho de " + usuario.getNome() + ".");
    }

    public void checkout (TipoPagamento tipo) {
        Pagamento pagamento = switch (tipo) {
            case PIX -> new Pix();
            case CREDITO -> new Credito();
        };
        if (pagamento.realizarPagamento(usuario)) {
            for (Jogo jogo: carrinho) {
                System.out.println("-> " + jogo.getNome() + " foi adicionado à sua biblioteca.");
                usuario.biblioteca.adicionarJogo(jogo);
            }
            carrinho = new ArrayList<>();
        }
    }

    public void mostrarCarrinho () {
        System.out.println("\nCarrinho (" + usuario.getNome() + "):");

        if (carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio.");
        } else {
            for (Jogo jogo : carrinho) {
                System.out.println("- " + jogo.getNome() + ": R$" + String.format("%.2f", jogo.getPreco()));
            }
            System.out.println("Total = R$" + String.format("%.2f", valorTotal()));
        }
    }
}
