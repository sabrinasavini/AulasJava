package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int [] vetor = new int[3];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        vetor[0] = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        vetor[1] = scanner.nextInt();

        System.out.println("Digite o terceiro valor");
        vetor[2] = scanner.nextInt();

        System.out.println("vetor {" + vetor[0] + "," + vetor[1] + "," + vetor[2] + "}");
        scanner.close();
    }
}
