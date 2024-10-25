package Aula04.Exercícios;

public class Exercicio6 {
    public static void main(String[] args) {
        int notao = 1;
        if (notao >= 7 && notao <= 10){
            System.out.println("Aprovado");
        } else if (notao >= 5 && notao < 7){
            System.out.println("Recuperação");
        } else if (notao < 5 && notao >= 0){
            System.out.println("Reprovado");
        }
    }
}