package br.com.demonslayer;

public class CacadorDeOnis extends Humano {

    private Respiracao respiracao;

    public CacadorDeOnis() {
        super();
    }

    public CacadorDeOnis(String nome) {
        super(nome);
    }

    public Respiracao getRespiracao() {
        return respiracao;
    }

    public void setRespiracao(Respiracao respiracao) {
        this.respiracao = respiracao;

    }
}