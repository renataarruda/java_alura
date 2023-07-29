package br.com.alura.audioapp.modelos;

import br.com.alura.audioapp.modelos.Audio;

public class Podcast extends Audio {
    private String nomeApresentadores;
    private int temporadas;
    private int quantidadeEpisodios;
    private double duracaoDoEpisodio;

    public String getNomeApresentadores() {
        return nomeApresentadores;
    }

    public void setNomeApresentadores(String nomeApresentadores) {
        this.nomeApresentadores = nomeApresentadores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public double getDuracaoDoEpisodio() {
        return duracaoDoEpisodio;
    }

    public void setDuracaoDoEpisodio(double duracaoDoEpisodio) {
        this.duracaoDoEpisodio = duracaoDoEpisodio;
    }
    public double getDuracaoEmMinutos(){
        return temporadas * duracaoDoEpisodio * quantidadeEpisodios;
    }
    public void mostraFichaTecnica(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Apresentado por: " + nomeApresentadores);
        System.out.println("Duração do episódio: " + getDuracaoDoEpisodio() + " minutos.");
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
