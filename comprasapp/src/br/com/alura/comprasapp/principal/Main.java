package br.com.alura.comprasapp.principal;
import br.com.alura.comprasapp.modelos.CartaoDeCredito;
import br.com.alura.comprasapp.modelos.Compras;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0){
            System.out.println("Digite o produto desejado: ");
            String produto = scanner.next();

            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            Compras compras = new Compras(produto, valor);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
                scanner.close();
            }
        }

        System.out.println("********* COMPRAS REALIZADAS *********\n");

        Collections.sort(cartao.getCompras());

        for (Compras item: cartao.getCompras()){
            System.out.println(item.getProduto() + " - " + item.getValorDoProduto());
        }

        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());

    }
}