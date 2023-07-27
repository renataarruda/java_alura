import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar:");
            notaFilme = leitura.nextDouble();

            if(notaFilme != -1){
                mediaAvaliacao += notaFilme;
                totalDeNotas++;
            }

        }
        System.out.println("Média de avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}


