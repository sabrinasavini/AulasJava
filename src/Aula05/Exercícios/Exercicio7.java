package Aula05.Exercícios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, tente novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota registrada: " + nota);
        sc.close();
    }
}