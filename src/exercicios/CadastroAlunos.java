package exercicios;

import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        Double[][] notas = new Double[3][2];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o nome do aluno: ");
             nomes[i] = scanner.nextLine();

             for(int j = 0; j < 2; j++){
                System.out.print("Digite a " + (j + 1) + " nota:");
                notas[i][j] = scanner.nextDouble();
                scanner.nextLine();
             }

                
        }

        for(int i = 0; i < nomes.length ; i++) {
            System.out.println("Aluno " + nomes[i]);
            double soma = 0;
                for(int j = 0; j < notas[i].length; j++){
                    System.out.println("Nota" + (j + 1) +": " + notas[i][j] );;
                    soma += notas[i][j];
                    
                }
                double media = soma / notas[i].length;
                String status = (media >= 7) ? "Aprovado" : "Reprovado";

                System.out.println(status + "\n");
        }



        scanner.close();
    }
}
