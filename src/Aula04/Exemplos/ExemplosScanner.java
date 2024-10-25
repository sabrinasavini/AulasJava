package Aula04.Exemplos;

import java.util.Scanner;

public class ExemplosScanner {
    public static void main(String[] args) {
        //Exemplo Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        int numero = scanner.nextInt();
        System.out.println("Você digitou o número "+ numero);

        //Exemplo 2
        System.out.println("---------exemplo 2------------");
        System.out.println("Escreva seu nome ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("Seu nome é :" + nome);


        //Exemplo3
        System.out.println("--------exemplo 3----------");
        System.out.println("");
    }
}
