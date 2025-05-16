package LambdaExpressions;
@FunctionalInterface //garante que a interface tenha apenas um metodo abstrato
public interface Operacao { //será usada como tipo para a lambda
    void executar();
}

class FunctionalInterfaceExemple {
    public static void main(String[] args) {
        Operacao operacao = () -> {
            int a = 3;
            int b = 5;
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }

        };
        operacao.executar();
    }
}
