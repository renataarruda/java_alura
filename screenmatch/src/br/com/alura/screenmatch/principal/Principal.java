package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Oppenheimer", 2023);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.exibeFichaTecnica();
        System.out.println("\n");

        Filme meuFilme2 = new Filme("Matrix", 1999);
        meuFilme2.setDuracaoEmMinutos(136);
        meuFilme2.setIncluidoNoPlano(true);

        meuFilme2.avalia(9);
        meuFilme2.avalia(10);
        meuFilme2.avalia(10);
        meuFilme2.exibeFichaTecnica();

        Serie serie = new Serie("Stranger Things",2018);
        serie.setIncluidoNoPlano(true);
        serie.setTemporadas(4);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(60);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar Stranger Things: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //É possível usar var em Java
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        //Array List
        // var listaDeFilmes = new ArrayList<>();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}
