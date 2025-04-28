package Exs;

import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        String[] nomes = new String[3];
        double[][] notas = new double[3][3];

        for(int i = 0; i<3; i++){
            System.out.print("Digite o nome do aluno"+ (i+1) +": ");
            nomes[i] = scanner.nextLine();

            for(int j = 0; j < 3; j++){
                System.err.print("Digite a nota "+ (j + 1) + " de " + nomes[i] + ":");
                    notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }
        System.out.println("\n--- RESULTADOS FINAIS ---");

        for (int i = 0; i < 3; i++){
            double soma = 0;
            System.err.println("\nExs.Aluno " + nomes[i]);
            System.out.print("Notas:");
            for(int j = 0; j <3; j++){
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }
            double media = soma /3;

            System.out.printf("\nMédia: %.2f\n", media);
        }
        scanner.close();
    }
    
}
