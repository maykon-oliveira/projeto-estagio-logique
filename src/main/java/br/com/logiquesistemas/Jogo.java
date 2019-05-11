package br.com.logiquesistemas;

import br.com.logiquesistemas.modelos.Jogador;
import br.com.logiquesistemas.modelos.Simbolo;

public class Jogo {

    private final Jogador jogador1;
    private Integer scoreJogador1 = 0;
    private final Jogador jogador2;
    private Integer scoreJogador2 = 0;
    private Integer scoreEmpate = 0;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void lancar() {
        Simbolo simboloJogador1 = jogador1.jogar();
        Simbolo simboloJogador2 = jogador2.jogar();

        Integer resultado = simboloJogador1.comparar(simboloJogador2);

        if (resultado == 1) {
            scoreJogador1++;
        } else if (resultado == -1) {
            scoreJogador2++;
        } else {
            scoreEmpate++;
        }

        System.out.printf("%s -> (%s X %s) <- %s\n", jogador1, simboloJogador1, simboloJogador2, jogador2);
    }

    public void imprimirResultado() {
        System.out.println("                 RESULTADO               ");
        System.out.println("=========================================");
        System.out.printf("\n|%-20s|          %s\n", "Nome jogador", "Pontuação");
        System.out.printf("|%-20s|          %5d\n", jogador1, scoreJogador1);
        System.out.printf("|%-20s|          %5d\n", jogador2, scoreJogador2);
        System.out.printf("|%-20s|          %5d\n", "Empates", scoreEmpate);
    }

}
