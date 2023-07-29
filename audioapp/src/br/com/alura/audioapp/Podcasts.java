package br.com.alura.audioapp;
public class Podcasts extends Audio {
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
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificacao: " + getClassificacao());
    }

}
