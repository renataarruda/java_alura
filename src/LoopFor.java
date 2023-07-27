import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme:");
            notaFilme = leitura.nextDouble();
            mediaAvaliacao += notaFilme;
        }
        System.out.println("Média de avaliações: " + mediaAvaliacao/3);
    }
}
