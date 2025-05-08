package Estudo;

public class GerenciadorDeTarefas {
    public enum Prioridade {
        ALTA,
        MEDIA,
        BAIXA
    }
    public static void main(String[] args) {
        String nomeTarefa = "Estudar Enums";
        Prioridade prioridade = Prioridade.ALTA;

        System.out.println("Nome: " + nomeTarefa);
        System.out.println("Prioridade: " + prioridade);

        switch (prioridade) {
            case ALTA:
                System.out.println("Esta tarefa deve ser feita imediatamente");
                break;
            case MEDIA:
                System.out.println("Pode ser feita hoje");
                break;
            case BAIXA:
                System.out.println("Pode esperar");
                break;
        }
    }
}
