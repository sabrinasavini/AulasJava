package Aula04.Exercícios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor");
        float qualquernome = scanner.nextInt();
        float desconto;
        if (qualquernome>100){
            desconto = qualquernome*0.1f;
            System.out.println("A sua compra teve um desconto de R$" + desconto);
        }
        else {
            System.out.println("você não teve desconto.");

            scanner.close();
        }
    }
}