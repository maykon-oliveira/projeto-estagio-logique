package br.com.logiquesistemas;

import br.com.logiquesistemas.modelos.Jogador;
import br.com.logiquesistemas.modelos.JogadorOnlyPapel;
import br.com.logiquesistemas.modelos.JogadorRandom;

public class Main {

    public static void main(String[] args) {

        Jogador jogadorOnlyPapel = new JogadorOnlyPapel();
        Jogador jogadorRandom = new JogadorRandom();

        Jogo jogo = new Jogo(jogadorOnlyPapel, jogadorRandom);
        short quantidadeRodadas = 100;

        while (quantidadeRodadas > 0) {
            jogo.lancar();
            
            quantidadeRodadas--;
        }

        jogo.imprimirResultado();
    }

}
