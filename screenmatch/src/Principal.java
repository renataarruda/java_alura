import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Oppenheimer");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.exibeFichaTecnica();
        System.out.println("\n");

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Matrix");
        meuFilme2.setAnoDeLancamento(1999);
        meuFilme2.setDuracaoEmMinutos(136);
        meuFilme2.setIncluidoNoPlano(true);

        meuFilme2.avalia(9);
        meuFilme2.avalia(10);
        meuFilme2.avalia(10);
        meuFilme2.exibeFichaTecnica();

        Serie serie = new Serie();
        serie.setNome("Stranger Things");
        serie.setAnoDeLancamento(2018);
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

    }
}
