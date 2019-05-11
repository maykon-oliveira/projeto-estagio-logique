package br.com.logiquesistemas.modelos;

public class JogadorOnlyPapel implements Jogador {

    public Simbolo jogar() {
        return Simbolo.PAPEL;
    }

    @Override
    public String toString() {
        return "JogadorOnlyPapel";
    }
}
