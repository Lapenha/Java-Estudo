package LambdaExpressions;

public interface LambdaObjetosComparador {
    boolean comparar(int a, int b);
}
class LambdaAsObject {
    public static void main(String[] args) {
        LambdaObjetosComparador lambdaObjetosComparador = (a, b) -> a > b;
            boolean resultado = lambdaObjetosComparador.comparar(1, 2);
                System.out.println("10 > 7? " + resultado);
    }
}