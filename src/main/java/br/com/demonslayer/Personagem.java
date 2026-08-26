package br.com.demonslayer;

public class Personagem {

    private String nome;

    public Personagem() {

    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}