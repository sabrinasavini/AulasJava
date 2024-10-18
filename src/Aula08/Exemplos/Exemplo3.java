package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\AulasJava\\src\\arquivo.txt", true);
            fileWriter.write("\nTexto gravado no modo append");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
