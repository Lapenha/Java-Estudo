package Exs;

import java.util.*;

public class AlunoTeste {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine(); // consumir o \n
            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a matrícula do aluno:");
            int matricula = sc.nextInt();

            System.out.println("Digite a nota do aluno:");
            double nota = sc.nextDouble();

            Aluno aluno = new Aluno(nome, matricula, nota);
            alunos.add(aluno);
        }

        System.out.println("\n--- LISTA DE ALUNOS ---");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }

        sc.close();
    }
}
