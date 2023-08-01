package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Oppenheimer", 2023);
        meuFilme.avalia(8);
        Filme meuFilme2 = new Filme("Matrix", 1999);
        meuFilme2.avalia(10);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie serie = new Serie("Stranger Things",2018);

        //Variável de referência: utilizada para chegar a um objeto
        //Filme f1 = filmeDoPaulo; // Não copia um novo objeto (não há uso do new). Aponta para um já existente.
        //f1.setNome("A Origem");
        //System.out.println(filmeDoPaulo);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(serie);

        //Laço for-each
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //Maneira de permitir o uso de um método exclusivo da classe Filme sem erro de compilação
            if(item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        //Método forEach
        //lista.forEach(item -> System.out.println(item));

        //Method Reference (forma reduzida da expressão lambda
        //lista.forEach(System.out::println);

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("David Tennant");
        buscaPorArtistas.add("Viola Davis");
        buscaPorArtistas.add("Marlon Brando");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);

    }
}
