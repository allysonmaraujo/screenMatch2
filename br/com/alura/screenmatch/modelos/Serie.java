package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int espisodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEspisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }

    public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEspisodio() {
        return minutosPorEspisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * espisodiosPorTemporada * minutosPorEspisodio;
    }

    public void setMinutosPorEspisodio(int minutosPorEspisodio) {
        this.minutosPorEspisodio = minutosPorEspisodio;
    }
}
