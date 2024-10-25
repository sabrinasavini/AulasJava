package Aula06.Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos usuários deseja cadastrar?");
        int quantUsers = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID", "NOME", "TELEFONE", "EMAIL","teste"};
        String[][] cadastros = new String[quantUsers + 1][cabecalho.length];
        cadastros[0] = cabecalho;

        for (int linha = 1; linha < cadastros.length; linha++){
            for (int coluna = 0; coluna < cabecalho.length; coluna++) {
                System.out.println(cabecalho[coluna]+":");
                cadastros[linha][coluna] = scanner.nextLine();
            }
        }
        String tabela ="";
        for (int linhas = 0; linhas < cadastros.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += cadastros[linhas][colunas];
                tabela += colunas ==0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
        scanner.close();
    }
}