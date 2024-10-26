package Aula04.Exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de câmbio
        double TAXA_DOLAR = 5.20; // 1 USD = 5.20 BRL
        double TAXA_EURO = 5.80;   // 1 EUR = 5.80 BRL
        double TAXA_LIBRA = 6.10;  // 1 GBP = 6.10 BRL

        System.out.print("Digite o valor em reais: ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");

        int opcao = scanner.nextInt();
        double valorConvertido = 0;

        switch (opcao) {
            case 1:
                valorConvertido = valorReais / TAXA_DOLAR;
                System.out.printf("Valor em Dólares: %.2f USD%n", valorConvertido);
                break;
            case 2:
                valorConvertido = valorReais / TAXA_EURO;
                System.out.printf("Valor em Euros: %.2f EUR%n", valorConvertido);
                break;
            case 3:
                valorConvertido = valorReais / TAXA_LIBRA;
                System.out.printf("Valor em Libras: %.2f GBP%n", valorConvertido);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        scanner.close();
    }
}