package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Oppenheimer", 2023);
        Filme meuFilme2 = new Filme("Matrix", 1999);
        var filmeDoPaulo = new Filme("Dogville",2003);
        Serie serie = new Serie("Stranger Things",2018);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(serie);

        //Laço for-each
        //for (Titulo item: lista) {
        //    System.out.println(item);
        //}

        //Método forEach
        //lista.forEach(item -> System.out.println(item));

        //Method Reference (forma reduzida da expressão lambda
        lista.forEach(System.out::println);
    }
}
