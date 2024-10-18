package Aula08.Exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo7 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\arquivo.txt"))) {
            String texto;
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}