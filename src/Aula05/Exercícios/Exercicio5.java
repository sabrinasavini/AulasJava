package Aula05.Exercícios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
            double media = soma / 5;
        System.out.println("A média das notas é: " + media);
        sc.close();
        }
    }