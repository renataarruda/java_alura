import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        //Inicializar dados do cliente;
        // Menu de opções;
        // Visualização do saldo;
        // Enviar valor;
        // Receber valor;

        String nomeDoCliente = "Maria da Silva";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;

        String dadosDoCliente = """
                ******************************
                Dados iniciais do cliente:
                
                Nome: Maria da Silva
                Tipo de conta: Corrente
                Saldo inicial: R$ 2500,00
                ******************************
                """;
        System.out.println(dadosDoCliente);
        String operacoes = ("""
                Operações:
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
        System.out.println(operacoes);
        Scanner scanner = new Scanner(System.in);
        int opcaoDesejada = 0;
        boolean continuar = true;
        double valorAReceber = 0;
        double valorATransferir = 0;

        while(continuar){
            System.out.println("Digite a opção desejada:");
            opcaoDesejada = scanner.nextInt();

            if(opcaoDesejada == 1){
                System.out.println("O seu saldo é de " + saldoInicial);
                System.out.println(operacoes);
            }
            if(opcaoDesejada == 2){
                System.out.println("Informe o valor a receber:");
                valorAReceber = scanner.nextDouble();
                System.out.println("Saldo atualizado R$ " + (saldoInicial + valorAReceber));
                saldoInicial += valorAReceber;
                System.out.println(operacoes);
            }
            if(opcaoDesejada == 3){
                System.out.println("Informe o valor que deseja transferir:");
                valorATransferir = scanner.nextDouble();
                if(valorATransferir < saldoInicial){
                    System.out.println("Saldo atualizado R$ " + (saldoInicial - valorATransferir));
                    saldoInicial -= valorATransferir;
                } else {
                    System.out.println("Saldo insuficiente. Transferência não realizada");
                }
                System.out.println(operacoes);
            }
            if(opcaoDesejada == 4){
                continuar = false;
            }
        }
    }
}
