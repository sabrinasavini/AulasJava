package Aula02;

public class Exercicio10 {
    public static void main(String[] args) {
        short valor1 = 2112; //Casting implícito de "short" para "int"
        int valor2 = valor1;
        System.out.println("O valor convertido é de "+valor1+" (short) para "+valor2 + " (int)");

        byte valor3 = (byte) valor1; //Casting explícito de "byte" para "short"
        System.out.println("O valor convertido é de " + valor1 + " (byte) para " + valor3 + " (short)");

    }
}