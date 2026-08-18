package br.com.demonslayer;

public class Personagem {

    public String nome;

    public Personagem() {

    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}