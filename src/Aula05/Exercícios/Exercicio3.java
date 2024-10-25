package Aula05.Exercícios;

public class Exercicio3 {
    public static void main(String[] args) {
        int num1 = 5;
        int fat1 = 1;
        for (int i = 1; i <= num1; i++) {
            fat1 *= i;

        }
        System.out.println("O fatorial de " + num1 + " é: " + fat1);
    }

}
