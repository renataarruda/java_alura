public class MetodosString {
    public static void main(String[] args) {
        // Text blocks (Java 15): consegue formatar blocos de texto dentro de aspas triplas.
        int anoDeLancamento = 2023;
        String sinopse;
        sinopse = """
                Filme: Barbie
                Filme de comédia sobre a boneca mais famosa do mundo.
                Avaliação: Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        /* Método equals():
        Compara se o conteúdo de duas Strings são iguais.

        Exemplo:
        String senha = "12345";
        if (senha.equals("12345")) {
         System.out.println("Acesso autorizado!");
        } else {
         System.out.println("Senha incorreta.");
        }
        */

        /*
        Método format()
        Permite formatar um texto utilizando diversos placeholders, representados pelo caractere % seguido de uma letra.
        Exemplo: %s - indica que será inserida uma String no placeholder;
                 %d - indica um valor inteiro
                 %f - indica um valor decimal
         */

        String nome = "Maria";
        int idade = 30;
        double valor = 55.99;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        //%.2f : significa que o valor deve ser formatado com duas casas decimais
    }
}
