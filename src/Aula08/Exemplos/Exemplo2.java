package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\AulasJava\\src\\arquivo.txt");
            fileWriter.write("\nTexto");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
