package Aula04;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um horário e descubra seu turno");
        int hora = sc.nextInt();

        String turno;
        if (hora >= 5 && hora < 12) {
            turno = "manhã";
        }
        else if (hora >= 12 && hora < 18) {
            turno = "tarde";
        }
        else if (hora >= 18 && hora < 22) {
            turno = "noite";
        }
        else {
            turno = "madrugada";

            System.out.println("Seu turno é durante a " + turno);

            sc.close();
        }
    }
}