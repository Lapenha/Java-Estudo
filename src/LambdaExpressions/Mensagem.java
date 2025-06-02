package LambdaExpressions;


public interface Mensagem {
    void enviar(String texto);
}
class EnviarMensagemMaiuscula {
    public static void main(String[] args) {
        Mensagem msg = (texto) -> System.out.println(texto.toUpperCase());
            msg.enviar("maria");
    }
}