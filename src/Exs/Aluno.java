package Exs;

public class Aluno {
    final private String nome;
    final private int matricula;
    final private double nota;
    final private boolean aprovado;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
        this.aprovado = nota >= 7.0;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public double getNota() { return nota; }

    public String getSituacao() {
        return aprovado ? "Aprovado" : "Reprovado";
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s\nMatrícula: %d\nNota: %.1f\nSituação: %s\n\n",
                getNome(), getMatricula(), getNota(), getSituacao());
    }
}
