package Aula06.Exercícios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a letra?");
        String[] vetor = {"O","A","P","C"};
        String valorDigi = scanner.next();
        String aviso = "Letra não encontrada";

        for (int posicao = 0; posicao < vetor.length; posicao++) {
            if (valorDigi.equals(vetor[posicao])){
                aviso = "Letra encontrada";
            }

        }
        System.out.println(aviso);


    }
}
