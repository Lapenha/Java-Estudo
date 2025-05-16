package LambdaExpressions;

import java.util.function.BiFunction;

public class LambdaBody {
    public static void main(String[] args) {
        //corpo de uma linha
        BiFunction<Integer, Integer, Boolean> maior = (a, b) -> a > b;
       // System.out.println("2 > 5???? " + maior.apply(2, 5));
        //corpo com multiplas linhas
        BiFunction<Integer, Integer, Integer> somar = (a, b) -> {
            int resultado = (a + b);
            System.out.println("Somando... "+a+" + "+b + " = " + resultado);
            return resultado;
        };
        somar.apply(5, 3);

    }
}
