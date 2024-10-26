package Aula05.Exercícios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int numero = sc.nextInt();

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                quantidadePares++; // Incrementa se for par
            } else {
                quantidadeImpares++; // Incrementa se for ímpar
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        sc.close();
    }
}