package br.com.demonslayer;

public class Oni extends Personagem {

    private Kekkijutsu kekkijutsu;

    public Oni() {
        super();
    }

    public Oni(String nome) {
        super(nome);
    }

    public Kekkijutsu getKekkijutsu() {
        return kekkijutsu;
    }

    public void setKekkijutsu(Kekkijutsu kekkijutsu) {
        this.kekkijutsu = kekkijutsu;
    }
}