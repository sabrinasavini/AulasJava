package Aula04.Exercícios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um horário e descubra seu turno");
        int hora = sc.nextInt();

        switch (hora){
                case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                System.out.println("Turno da manhã");
                break;
                case 13: case 14: case 15: case 16: case 17:
                System.out.println("Turno da tarde");
                break;
                case 18: case 19: case 20: case 21: case 22:
                System.out.println("Turno da noite");
                break;
                case 23: case 0: case 1: case 2: case 3: case 4:
                System.out.println("Turno da madrugada");
            sc.close();
        }
    }
}