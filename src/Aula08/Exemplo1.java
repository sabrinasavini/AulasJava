package Aula08;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivos = new File("C:\\Users\\Aluno\\IdeaProjects\\AulasJava\\src\\arquivo.txt");

        if (arquivos.exists()){
            System.out.println("Existe");
        }else {
            System.out.println("Não existe");
            try {
                if (arquivos.createNewFile()){
                    System.out.println("Arquivo criado com sucesso");
                }else {
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}