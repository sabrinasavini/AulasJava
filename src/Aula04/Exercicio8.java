package Aula04;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Avalie o funcionário");
        int avalie = sc.nextInt();
        switch (avalie){

            case 1:
                System.out.println("Precisa melhorar");
                break;
                case 2:
                    System.out.println("Abaixo da média");
                    break;
                    case 3:
                        System.out.println("Dentro da média");
                        break;
                        case 4:
                            System.out.println("Ácima da média");
                            break;
                            case 5:
                                System.out.println("Excelente");
                                break;
            default:
                System.out.println("Utilize um valor entre 1 e 5 para a avaliação");
                sc.close();
        }
    }
}
