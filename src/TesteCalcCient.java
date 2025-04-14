public class TesteCalcCient {
    public static void main(String [] args) {
    CalculadoraCientifica calcTeste = new CalculadoraCientifica();

   System.out.println(calcTeste.raiz("95"));
   System.out.println(calcTeste.raiz(9.6));
   System.out.println(calcTeste.raiz(9));
   System.out.println(calcTeste.potencia(1, 7.2));
   System.out.println(calcTeste.potencia("20", "7"));
   System.out.println(calcTeste.potencia(6, 6));


    
    }
}
