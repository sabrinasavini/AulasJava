package Aula05.Exercícios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera número de 1 a 100
        int palpite;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo, tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto, tente novamente.");
            } else {
                System.out.println("Parabéns!");
            }

        } while (palpite != numeroAleatorio); // Continua até o palpite estar correto

        scanner.close();
    }
}