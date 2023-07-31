package br.com.alura.exercicios;

public class ExercicioTemperatura {
    public static void main(String[] args){
        // Escreva um programa que converta a temperatura em graus Celsius para Fahrenheit.
        // Utilize variáveis para representar os valores das temperaturas
        // Imprima no console o valor convertido de Celsius para Fahrenheit
        // Fórmula: (temperatura * 1.8) + 32


        double celsius = 30;
        double farenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Farhenheit.",
                celsius, farenheit);

        System.out.println(mensagem);

        int tempFar = (int) farenheit;

        System.out.println("A temperatura em Farenheit inteira é de " + tempFar + ".");
    }
}
