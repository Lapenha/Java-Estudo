package LambdaExpressions;

public interface LogVariableCapture {
    void registrar();
}
class StaticVariabeleCapture {
    final private static String sistema = "Sistema";

    public static void main(String[] args) {
        LogVariableCapture logVariableCapture = () -> System.out.println("Logando em "+ sistema);
        logVariableCapture.registrar();
    }
}
