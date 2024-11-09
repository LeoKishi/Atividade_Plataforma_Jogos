package Plataforma;

public class Jogo {
    private String nome;
    private String dataLancamento;
    private String genero;
    private float preco;

    public Jogo(String nome, String dataLancamento, String genero, float preco){
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
