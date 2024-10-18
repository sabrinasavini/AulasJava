package Aula08.Exemplos;

public class Exemplo8 {
    public static void main(String[] args) {
        String linha = "ID:1 ;Nome:Sabrina;Idade:22";
        String[] tokens = linha.split(";");

        for (String token : tokens){
            System.out.println(token); //O Split quebra a String em várias partes do mesmo token

        }
        String[] id = tokens[0].split(":");
        String[] nome = tokens[1].split(":");
        String[] idade = tokens[2].split(":");

        System.out.println(id[1]+", "+ nome[1]+", "+ idade[1]);

        int valorIdade = Integer.parseInt(idade[1].trim()); //Trim tira os espaços antes e depois da String
        System.out.println("A idade agora é " + (valorIdade+1));

    }
}