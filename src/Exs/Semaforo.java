package Exs;

public class Semaforo {
    public enum Luzes {
        VERMELHO("Pare"),
        AMARELO("Atenção"),
        VERDE("Siga");

        private final String codigo;

        Luzes(String codigo) {
            this.codigo = codigo;
        }
    
        public String getCodigo() {return codigo;}


    }
    public static void main(String[] args) {
        System.out.println("Cor: VERMELHO -> " + Luzes.VERMELHO.getCodigo());
        System.out.println("Cor: AMARELO -> " + Luzes.AMARELO.getCodigo());
        System.out.println("Cor: VERDE -> "+ Luzes.VERDE.getCodigo());


    }
}
