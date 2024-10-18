package Aula07.Exemplos;

public class Exemplo3 {
    public static void main(String[] args) {
        int soma = funcaoComParametrosComRetorno(2,3);

        System.out.println(soma);
    }
    static int funcaoComParametrosComRetorno(int parametro1, int parametro2){
        return parametro1 + parametro2;
    }
}
