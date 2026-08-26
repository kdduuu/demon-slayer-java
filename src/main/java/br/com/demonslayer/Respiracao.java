package br.com.demonslayer;

public class Respiracao {

    private String nome;
    private String origem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void exibirInformacoes() {
        System.out.println("Respiração: " + nome);
        System.out.println("Origem: " + origem);
    }
}