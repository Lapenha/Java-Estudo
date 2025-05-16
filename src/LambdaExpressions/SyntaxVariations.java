package LambdaExpressions;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Impressao {
     void imprimir();
}

public class SyntaxVariations {
    public static void main(String[] args) {
        Runnable zero = () -> System.out.println("Sem parametros");

        ///um parametro com parenteses
        Function<String, String> comParenteses = (nome) -> "Olá" + nome;
        System.out.println(comParenteses.apply("Murilo"));


        //um parametro sem parenteses
        Function<String, String> semParenteses = nome -> "Olá" + nome;
        System.out.println(semParenteses.apply("Java"));

        //dois parametros
        BiFunction<Integer, Integer, Integer> soma = (n1, n2) -> n1 + n2;
        System.out.println(soma.apply(1, 2));
    }
}
