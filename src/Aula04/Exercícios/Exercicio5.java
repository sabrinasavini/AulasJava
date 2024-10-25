package Aula04.Exercícios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas trabalhadas?");
        int horaextra= scanner.nextInt();
        if (horaextra>40){
            System.out.println("Seu ganho é de " + horaextra*0.5);


    }
        else {
            System.out.println("Você não atingiu o número de horas necessárias.");
            scanner.close();
        }
}}