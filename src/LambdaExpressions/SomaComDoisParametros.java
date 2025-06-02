package LambdaExpressions;

import java.util.function.BiFunction;

public class SomaComDoisParametros {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
        System.out.println(soma.apply(1, 2));

    }
}
