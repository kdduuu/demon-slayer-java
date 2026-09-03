package br.com.demonslayer;

public class Kekkijutsu {

    private String nome;

    public Kekkijutsu() {

    }

    public Kekkijutsu(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Kekkijutsu: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}