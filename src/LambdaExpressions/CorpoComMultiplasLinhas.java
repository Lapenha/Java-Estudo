package LambdaExpressions;

import java.util.function.BiFunction;

public class CorpoComMultiplasLinhas {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> diferenca = (a, b) -> {
            System.out.println(a + " - " + b + " = " + (a - b));
            return a - b;
        };
        diferenca.apply(5, 3);


    }
}
