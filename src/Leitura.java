import java.util.Scanner;

// A classe Scanner é utilizada para ler dados de entrada.
// Os dados podem ser lidos a partir de várias fontes de entrada: input do usuário, arquivos, Strings, fluxos de entrada


public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento:");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga a sua avaliação para o filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitura.close();
    }
}
