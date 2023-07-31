package br.com.alura.exercicios;

import com.sun.source.tree.CompilationUnitTree;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAdivinhacao {
    // Crie um programa que simula um jogo de adivinhação.
    // Deve gerar um número aleatório entre 0 e 100 e pedir para o usuário adivinhar o número em até 5 tentativas.
    // A cada tentativa, o programa deve informar se o número digitado é maior ou menor que o número gerado.
    // Número aleatório: new Random().nextInt(100)
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Adivinhe o número gerado: ");
            int numeroUsuario = leitura.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("O número informado é menor. Tente novamente.");
            }

            if (numeroUsuario > numeroAleatorio) {
                System.out.println("O número informado é maior. Tente novamente.");
            }
            if(numeroUsuario == numeroAleatorio) {
                System.out.println("Você acertou!");
                break;
            }
        }
    }
}
