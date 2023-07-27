import br.com.alura.screenmatch.modelos.Filme;

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
    }
}
