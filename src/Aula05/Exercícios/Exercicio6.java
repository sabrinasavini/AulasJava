package Aula05.Exercícios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int termos = 10;
        int a = 0;
        int b = 1;
        int contador = 0;

        System.out.println("Os primeiros " + termos + " números da sequência de Fibonacci são:");

        while (contador < termos) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }
    }
}