package Exception;

import java.lang.Exception;

public class SampleException {


    public static void main(String[] args) {
        try {
            throw new Exception();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyException extends Exception {
    int a;
    MyException(int b){
        a=b;
    }
    public String toString() {
        return("My exception number = "+a);
    }
}