public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();

        imp.exibir(1.5);
        imp.exibir("null", 2.5);
        imp.exibir(2.1, "String");
        imp.exibir(1.3, 1.6);
        imp.exibir(1, 2, "Sim00");
        imp.exibir("a", "b", "c");
    }
    
}
