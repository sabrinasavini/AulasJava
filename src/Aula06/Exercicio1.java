package Aula06;

public class Exercicio1 {
    public static void main(String[] args) {
int[] vetor = {1, 2, 3, 4, 5};
int soma = 0;
for (int i = 0; i < vetor.length; i++) {
    soma +=vetor[i];
}
        System.out.println("A soma dos elementos do vetor é: " +soma);
    }
}
