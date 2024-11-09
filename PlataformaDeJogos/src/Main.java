import Compra.TipoPagamento;
import Plataforma.Jogo;
import Plataforma.Usuario;


public class Main {
    public static void main(String[] args) {
        // instanciando jogos
        Jogo skyrim = new Jogo("Skyrim", "11/11/2011", "RPG", 149.00F);
        Jogo stardewValley = new Jogo("Stardew Valley", "26/02/2016", "Sandbox", 24.99F);
        Jogo gtaV = new Jogo("GTA V", "13/04/2015", "Ação", 38.63F);

        // instanciando um usuário
        Usuario user = new Usuario("Aluno", "aluno@gmail.com", "abc111");

        // chamando métodos
        user.carrinho.adicionarItem(gtaV);
        user.carrinho.adicionarItem(stardewValley);
        user.carrinho.adicionarItem(skyrim);
        user.carrinho.removerItem(gtaV);

        user.biblioteca.mostrarBiblioteca();
        user.carrinho.mostrarCarrinho();

        user.carrinho.checkout(TipoPagamento.PIX);

        user.carrinho.mostrarCarrinho();
        user.biblioteca.mostrarBiblioteca();

        user.biblioteca.jogar(gtaV);
        user.biblioteca.jogar(stardewValley);
    }
}