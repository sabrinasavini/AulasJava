package Aula04;

public class Exercicio2 {
    public static void main(String[] args) {
        float qualquernome=230;
        float desconto;
        if (qualquernome>100){
            desconto = qualquernome*0.1f;
            System.out.println("A sua compra teve um desconto de R$" + desconto);
        }
    }
}
