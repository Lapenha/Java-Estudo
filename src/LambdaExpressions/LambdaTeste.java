package LambdaExpressions;
//sintaxe lambda: (parameters) -> { corpo }
//() -> System.out.println("Olá Mundo");
//name -> Syst...(name);
//(a, b) -> Syst...(a+b);
//com retorno: (a, b) -> a + b;
public class LambdaTeste {
    public static void main(String[] args)  {
        Runnable executar = () -> System.out.println("Executando"); //Runnable é uma interface funcional com apenas um metodo. run
        executar.run(); //run executa nossa funcao, porem o lambda substitui sua implementacao
    }
}

