package Aula08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        File arqv = new File("C:\\Users\\Aluno\\IdeaProjects\\AulasJava\\src\\alunos.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter(arqv, true);
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o nome do "+(i+1)+"º aluno");
                String nomeDigitado = scanner.nextLine();
                fileWriter.write(nomeDigitado + "\n");
            }

            fileWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}