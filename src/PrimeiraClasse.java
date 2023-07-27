public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");

        int anoDeLancamento = 2023;
        String nomeDoFilme = "Barbie";
        System.out.println("Filme: " + nomeDoFilme + "\n" + "Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas notas de quem assistiu ao filme:
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Nota média: " + media);

        String sinopse;
        sinopse = """
                Filme: Barbie
                Filme de comédia sobre a boneca mais famosa do mundo.
                Avaliação: Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // Casting (conversão forçada de tipos. Há risco de perder dados)
        // cast implícito: feito pelo compilador quando o tipo de dado de destino é compatível com o dado de origem.
        int classificacao = (int) (media / 2); // cast explícito
        System.out.println(classificacao);


    }
}