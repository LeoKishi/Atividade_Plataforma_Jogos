package Plataforma;

import java.util.ArrayList;


public class Biblioteca {
    private Usuario usuario;
    private ArrayList<Jogo> jogos = new ArrayList<>();

    public Biblioteca(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarJogo (Jogo jogo) {
        jogos.add(jogo);
    }

    public void mostrarBiblioteca () {
        System.out.println("\nBiblioteca (" + usuario.getNome() + "):");

        if (jogos.isEmpty()) {
            System.out.println("Sua biblioteca está vazia.");
        } else {
            for (Jogo jogo : jogos) {
                System.out.println("- " + jogo.getNome());
            }
        }
    }

    public void jogar (Jogo jogo) {
        System.out.println("\n-> Iniciando " + jogo.getNome() + "...");

        if (jogos.contains(jogo)) {
            System.out.println("* " + jogo.getNome() + " está aberto.");
        } else {
            System.out.println("* " + jogo.getNome() + " não está na sua biblioteca!");
        }

    }
}
