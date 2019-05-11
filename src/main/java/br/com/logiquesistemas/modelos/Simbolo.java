package br.com.logiquesistemas.modelos;

public enum Simbolo {
    PEDRA, PAPEL, TESOURA;

    /**
     * Compara o simbolo com outro para determinar a precedencia.
     *
     * @param {Simbolo} outroSimbolo - Simbolo que será comparado.
     * @return {Short} Retorna 0 se empate. 1 se o simbolo tem precedencia ou -1 se não tem precedencia.
     */
    public Integer comparar(Simbolo outroSimbolo) {
        if (this == outroSimbolo)
            return 0;

        switch (this) {
            case PEDRA:
                return (outroSimbolo == TESOURA ? 1 : -1);
            case PAPEL:
                return (outroSimbolo == PEDRA ? 1 : -1);
            case TESOURA:
                return (outroSimbolo == PAPEL ? 1 : -1);
            default:
                return 0;
        }
    }
}
