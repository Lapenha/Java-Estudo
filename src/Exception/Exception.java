package Exception;

public class Exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception"); //tenta pegar o length de uma string nula
        }

        try {
            int a =30, b=0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){ //divisao por zero
            System.out.println("Cant divide by zero");
        }

        try{
            int num = Integer.parseInt("julia");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }

        try {
            int a[] = new int[5];
            a[7]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("finally");
        }
    }
}
