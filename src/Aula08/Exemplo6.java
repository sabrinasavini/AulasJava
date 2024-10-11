package Aula08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("scr\\arquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Texto a ser gravado no arquivo com buffer");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}