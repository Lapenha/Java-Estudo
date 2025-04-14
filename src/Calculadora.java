public class Calculadora {
    public int soma(int a, int b){
        int resultado = a + b;
        return resultado;
    }
        public int soma(String a, int b){
            return Integer.parseInt(a) + b;
        }
            public int soma(int a, String b){
                return a + Integer.parseInt(b); 
            }

    public int subtracao(int a, int b){
        int resultado = a - b;
        return resultado;
    }

    
    public int multiplicacao(int a, int b){
        int resultado = a * b;
        return resultado;
    }

}
