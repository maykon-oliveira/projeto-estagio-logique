package br.com.logiquesistemas.modelos;

import org.junit.Assert;
import org.junit.Test;

public class SimboloTest {

    @Test
    public void deveria_retornar_pedra_ganha_tesoura() {
        Simbolo pedra = Simbolo.PEDRA;
        Simbolo tesoura = Simbolo.TESOURA;
        Assert.assertSame(1, pedra.comparar(tesoura));
    }

    @Test
    public void deveria_retornar_pedra_perde_papel() {
        Simbolo pedra = Simbolo.PEDRA;
        Simbolo tesoura = Simbolo.PAPEL;
        Assert.assertSame(-1, pedra.comparar(tesoura));
    }

    @Test
    public void deveria_retornar_pedra_igual_pedra() {
        Simbolo pedra = Simbolo.PEDRA;
        Simbolo tesoura = Simbolo.PEDRA;
        Assert.assertSame(0, pedra.comparar(tesoura));
    }

    @Test
    public void deveria_retornar_papel_ganha_pedra() {
        Simbolo pedra = Simbolo.PAPEL;
        Simbolo tesoura = Simbolo.PEDRA;
        Assert.assertSame(1, pedra.comparar(tesoura));
    }

    @Test
    public void deveria_retornar_papel_perde_tesoura() {
        Simbolo pedra = Simbolo.PAPEL;
        Simbolo tesoura = Simbolo.TESOURA;
        Assert.assertSame(-1, pedra.comparar(tesoura));
    }
}
