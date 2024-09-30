package Aula06;

import java.util.Scanner;

public class Exemplos1e2 {
    public static void main(String[] args) {
        //Criação de Inicialização de uma matriz
        int [][] matriz =  new int[2][3];

        matriz [0][0]= 1;
        matriz [0][1]= 2;
        matriz [0][2]= 3;
        matriz [1][0]= 4;
        matriz [1][1]= 5;
        matriz [1][2]= 6;
        System.out.println("Elemento na posição [0][2]" + matriz [0][2]);


//Exemplo2
        int [] vetor = new int[3];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        vetor[0] = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        vetor[1] = scanner.nextInt();

        System.out.println("Digite o terceiro valor");
        vetor[2] = scanner.nextInt();

        System.out.println("vetor {" + vetor[0] + "," + vetor[1] + "," + vetor[2] + "}");
        scanner.close();

    }
}
