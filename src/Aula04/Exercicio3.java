package Aula04;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o código");
        int eletronicos= scanner.nextInt();
        switch (eletronicos){

            case 1:
                System.out.println("Eletrônicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            default:
                System.out.println("Não existe");

                scanner.close();
        }

    }
}
