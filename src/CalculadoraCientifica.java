public class CalculadoraCientifica {

    public double raiz(int a){
        return Math.sqrt(a);
    }

    public double raiz(double a){
        return Math.sqrt(a);
    }

    public double raiz(String a){
        return Math.sqrt(Double.parseDouble(a));
    }    

    public double potencia(byte a, byte b){
        return Math.pow(a, b);
    }
    public double potencia(String a, String b){
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double potencia(int a, double b){
        return Math.pow(a, b);
    }

}