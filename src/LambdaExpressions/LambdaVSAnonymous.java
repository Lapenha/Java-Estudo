package LambdaExpressions;

interface Impressora {
    void imprimir(String texto);
}

public class LambdaVSAnonymous {
    public static void main(String[] args) {
        Impressora anonima = new Impressora() {
            public void imprimir(String texto) {
                System.out.println("Anonima: " + texto);
            }
        };
        anonima.imprimir("Java");

        Impressora lambda = texto -> System.out.println("Lambda: " + texto);
            lambda.imprimir("Lambda");
    }
}
