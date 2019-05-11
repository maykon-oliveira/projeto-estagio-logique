package br.com.logiquesistemas.modelos;

import java.util.Random;

public class JogadorRandom implements Jogador {

    private final Random random;

    public JogadorRandom() {
        random = new Random();
    }

    public Simbolo jogar() {
        return Simbolo.values()[random.nextInt(Simbolo.values().length)];
    }

    @Override
    public String toString() {
        return "JogadorRandom";
    }

}
