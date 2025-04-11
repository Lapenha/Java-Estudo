package exercicios;

import java.util.Scanner;

public class CadastAlunosMelhor {

    public static void main(String[] args) {
        String[] nomes = new String[5];
        Double[][] notas = new Double[5][3];
        double somaDasMedias = 0;

        String melhorAluno = "";
        double maiorMedia = 0;

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                scanner.nextLine(); // limpa o buffer
            }
        }

        // Saída e cálculo
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nAluno: " + nomes[i]);

            // Copiando as 3 notas do aluno para um array simples
            double[] notasDoAluno = new double[3];
            for (int j = 0; j < 3; j++) {
                notasDoAluno[j] = notas[i][j];
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }

            double media = calcularMedia(notasDoAluno);
            somaDasMedias += media;

            if (media > maiorMedia) {
                maiorMedia = media;
                melhorAluno = nomes[i];
            }

            String status = (media >= 7.0) ? "Aprovado" : "Reprovado";
            System.out.printf("Média: %.2f - %s\n", media, status);
        }

        double mediaGeral = somaDasMedias / nomes.length;
        System.out.printf("\nMelhor aluno: %s (%.2f)\n", melhorAluno, maiorMedia);
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);

        scanner.close();
    }

    // Método para calcular média
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
