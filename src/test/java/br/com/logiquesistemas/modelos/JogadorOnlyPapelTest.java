package br.com.logiquesistemas.modelos;

import org.junit.Assert;
import org.junit.Test;

public class JogadorOnlyPapelTest {

    private final JogadorOnlyPapel jogadorOnlyPapel;

    public JogadorOnlyPapelTest() {
        this.jogadorOnlyPapel = new JogadorOnlyPapel();
    }

    @Test
    public void deveria_retornar_somente_simbolo_papel() {
        Simbolo primeiraJogada = jogadorOnlyPapel.jogar();
        Simbolo segundaJogada = jogadorOnlyPapel.jogar();

        Assert.assertEquals(Simbolo.PAPEL, primeiraJogada);
        Assert.assertEquals(Simbolo.PAPEL, segundaJogada);
    }
}
