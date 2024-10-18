package Aula07.Exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        Exemplo1.funcaoSemParametrosSemRetorno();
    }
    static void funcaoComParametrosSemRetorno(int parametro1, String parametro2){
        System.out.println("parametro1 = " + parametro1);
        System.out.println("parametro2 = " + parametro2);
    }
}
