package Exception;


import java.lang.Exception;

public class TesteException {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int soma = a / b;
            System.out.println(soma);
        }catch(Exception e) {
            System.out.println("ArithmeticException");
        }

    }
}

