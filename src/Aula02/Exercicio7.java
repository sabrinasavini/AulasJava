package Aula02;


public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true; // está chovendo
        boolean cond2 = false; // está frio
        boolean cond3 = true; // é feriado

        boolean resultado1 = cond1 && cond2; // verdadeiro se está chovendo e está frio
        boolean resultado2 = cond1 || cond3; // verdadeiro se chove ou é feriado

        System.out.println("Está chovendo e faz frio " + resultado1);
        System.out.println("Faz frio ou é feriado " + resultado2);

        boolean todos = (cond1 || cond3) && !cond2;
        System.out.println("Está chovendo, faz frio e é feriado " + todos);
    }

    }