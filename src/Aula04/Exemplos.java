package Aula04;

public class Exemplos {
    public static void main(String[] args) {
        int x = 50;
        if (x > 30) {
            System.out.println("Número maior que 30");
        } else {
            System.out.println("Número menor que 30");
        }

        //Exemplo 2

        String corSemaforo = "Verde";
        if (corSemaforo == "Verde") {
            System.out.println("Siga");
        } else if (corSemaforo == "Amarelo") {
            System.out.println("Cuidado");

        } else if (corSemaforo == "Vermelho") {
            System.out.println("Pare");
        }else {
            System.out.println("Cor inválida");
        }
//Exemplo 3
      int Idade = 18;
        if (Idade > 0 && Idade <= 12) {
            System.out.println("Criança");
        }   else if (Idade > 13 && Idade <= 17) {
            System.out.println("Adolescente");
        } else if (Idade > 18 && Idade <= 64 ) {
            System.out.println("Adulto");
        } else if (Idade > 65 ) {
            }

        //Exemplo 4 Operador Ternário
        x = 50;

                boolean r;

        r = x > 30 ? true : false;
        System.out.println(r);

        Idade = 10;
        String verificaIdade;

        verificaIdade = Idade>18 ? "Maior de Idade" : "Menor de Idade";
        System.out.println(verificaIdade);

        int preco = 100;
        float desconto;

        desconto = preco>80 ? 0.5f : 0;

        System.out.println("valor com desconto = " + (preco - preco * desconto));

    }
}
