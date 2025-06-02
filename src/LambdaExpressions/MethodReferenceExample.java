package LambdaExpressions;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void imprimir(String texto) {
    System.out.println("Imprimindo " + texto);
    }
    public static void main(String[] args) {
        //lambda comum
        Consumer<String> lambda = s -> imprimir(s);
        //Referencia de metodo
        Consumer<String> referencia = MethodReferenceExample::imprimir;

        lambda.accept("Hello lambda");
        referencia.accept("Hello referencia");
    }
}
