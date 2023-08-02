package br.com.alura.audioapp.principal;

import br.com.alura.audioapp.modelos.MinhasPreferidas;
import br.com.alura.audioapp.modelos.Musica;
import br.com.alura.audioapp.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("bad guy");
        musica.setAlbum("When we all fall sleep where do we go?");
        musica.setNomeArtista("Billie Eilish");
        musica.setAnoLancamento(2019);
        musica.mostraFichaTecnica();
        musica.isLancamento();
        musica.reproduzir();
        musica.classificar(3.5);
        musica.curtir();

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }
        System.out.println("\n");

        Podcast podcast = new Podcast();
        podcast.setTitulo("Braincast");
        podcast.setNomeApresentadores("Carlos Merigo e Bia Fiorotto");
        podcast.setTemporadas(10);
        podcast.setQuantidadeEpisodios(100);
        podcast.setDuracaoDoEpisodio(60.0);
        podcast.mostraFichaTecnica();
        podcast.reproduzir();
        podcast.classificar(4.0);
        podcast.curtir();
        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }
        System.out.println("\n");

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}