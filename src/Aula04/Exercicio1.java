package Aula04;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite sua idade");

        int idade=scanner.nextInt();
        if (idade>=18) {
            System.out.println("Autorizado");}
            else{
                System.out.println("Não Autorizado");}

            scanner.close();
    }
}
