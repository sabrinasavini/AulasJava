package Aula06;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int[] vetor = new int [3];
        Scanner scanner = new Scanner(System.in);
        String valorVetor = "vetor {";

        for (int posicao = 0; posicao < vetor.length;posicao++) {
            System.out.println("Digite o " + (posicao+1) + " valor:");
            vetor[posicao] = scanner.nextInt();
            valorVetor += vetor[posicao] + ",";
        }

        valorVetor += "}";
        System.out.println(valorVetor);
        scanner.close();
    }
}
