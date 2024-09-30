package Aula05;

public class Exercicio2 {
    public static void main(String[] args) {
        int armaz = 0, par = 2;
        while (par <= 100) {
            armaz = armaz + par;
            par +=2;
        }
        System.out.println(armaz);
    }
}