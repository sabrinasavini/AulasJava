package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //Exemplo 2
        String nome = "sabrina", nomeDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nomeDigitado = scanner.nextLine();

        while (!nome.equals(nomeDigitado)){
            System.out.println("Nome errado, digite novamente");
            nomeDigitado = scanner.nextLine();
        }
        System.out.println("Seu nome é "+nomeDigitado);

        //Exemplo 3 do-while
        int contador = 10;
        do {
            System.out.println(contador);
            contador = contador + 1;
        } while (contador < 20);

        //Exemplo 4
        do {
            System.out.println("Digite seu nome");
            nomeDigitado = scanner.nextLine();
        } while (!nome.equals(nomeDigitado));
        System.out.println("Seu nome é " + nomeDigitado);

        //Exemplo 5

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        //Exemplo 6 - ÍMPAR E PAR
        int par = 0, impar = 0, número;
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Digite o "+i + "número");
            número = scanner.nextInt();
            if (número%2 == 0) {
                par++;
            }else {
            impar++;
        }
            System.out.println("Você digitou " + par + " pares e " + impar + " impares");

            //Exemplo 7 - CÁLCULO DE FATORIAL
            System.out.println("Digite um número: ");
            int fatorial1 = scanner.nextInt();
            int valorRecebido = fatorial1;
            for (int j = 1; j < fatorial1; j++) {
                fatorial1 = fatorial1 * j;
            }
            System.out.println("O fatorial de " + valorRecebido+ " é " + fatorial1);

        }
    }
}

