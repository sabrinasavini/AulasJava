package Aula02.Exercícios;

public class Exercicio9 {
    public static void main(String[] args) {
        float var1 = 232.7f;
        long var2 = (long) var1; //Casting explícito de "float" para "long"
        System.out.println("O valor convertido é de " + var1 + " (float) para " + var2 + " (long) ");

        double var3 = var2; //Casting implícito de "double" para "long"
        System.out.println("O valor convertido é de " + var3 + " (double) para " + var2 + " (long) ");
    }
}