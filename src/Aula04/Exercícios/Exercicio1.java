package Aula04.Exercícios;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Acesso negado");
            sc.close();
        }
    }
}