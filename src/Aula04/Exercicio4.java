package Aula04;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Qual é o valor das vendas?");
        float valor1= scanner.nextFloat();
        if (valor1<1000){
            System.out.println("Sua comissão é de " + (valor1*5f)/100);
            
        } else if (valor1>=1000 && valor1<5001) {
            System.out.println("Sua comissão é de " + (valor1*10f)/100);
            

            
        } else if (valor1>5000) {
            System.out.println("Sua comissão é de " + (valor1*15f)/100);

            scanner.close();
        }
    }
}
