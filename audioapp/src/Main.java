import br.com.alura.audioapp.Musicas;
import br.com.alura.audioapp.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas musica = new Musicas();
        musica.setTitulo("bad guy");
        musica.setAlbum("When we all fall sleep where do we go?");
        musica.setNomeArtista("Billie Eilish");
        musica.setAnoLancamento(2019);
        musica.setClassificacao(4);
        musica.setCurtidas(300);
        musica.setDuracaoEmMinutos(40);
        musica.setCurtidoPeloUsuario(false);
        musica.mostraFichaTecnica();
        musica.isLancamento();
        musica.reproduzir();
        musica.classificar(3.5);
        musica.curtir();
        System.out.println("\n");

        Podcasts podcast = new Podcasts();
        podcast.setTitulo("Braincast");
        podcast.setNomeApresentadores("Carlos Merigo e Bia Fiorotto");
        podcast.setTemporadas(10);
        podcast.setQuantidadeEpisodios(100);
        podcast.setDuracaoDoEpisodio(60.0);
        podcast.setTotalDeReproducoes(1000);
        podcast.setClassificacao(5);
        podcast.setCurtidas(150);
        podcast.setCurtidoPeloUsuario(false);
        podcast.mostraFichaTecnica();
        podcast.reproduzir();
        podcast.classificar(4.0);
        podcast.curtir();
        System.out.println("\n");
    }
}