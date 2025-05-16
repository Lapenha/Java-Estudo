package LambdaExpressions;

import java.util.function.Function;

public class ParameterTypes {
    public static void main(String[] args) {
        Function<String, String> maiusculo = (String s) -> s.toUpperCase();
        Function<String, String> minusculo = (String s) -> s.toLowerCase();
        Function<String, String> comVar = (var s) -> "[" + s.trim() + "]";

        System.out.println(maiusculo.apply("Java"));
        System.out.println(minusculo.apply("Java"));
        System.out.println(comVar.apply("Java"));
    }
}
