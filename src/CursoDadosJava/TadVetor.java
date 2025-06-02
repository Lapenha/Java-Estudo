package CursoDadosJava;

import java.util.Scanner;

public class TadVetor {
    int tamanho, valorMinimo, valorMax, posicaoVaga, repeticao;

    public TadVetor(int tamanho, int valorMinimo, int valorMax, int posicaoVaga, int repeticao) {
        this.tamanho = tamanho;
        this.valorMinimo = valorMinimo;
        this.valorMax = valorMax;
        this.posicaoVaga = posicaoVaga;
        this.repeticao = repeticao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho, valorMinimo, valorMax, posicaoVaga, repeticao;

        while (true){
            System.out.println("========================================");
            System.out.println("     CONFIGURAÇÕES INICIAIS DO VETOR     ");
            System.out.println("========================================");

            //TAMANHO DO VETOR
            System.out.print("\n Tamanho do vetor: ");
            tamanho = sc.nextInt();
            if(tamanho <= 0){
                System.out.println("ERRO: O vetor deve ter tamanho maior que zero");
                continue;
            }

            //VALOR MÍNIMO E MÁXIMO
            System.out.print("\n Valor mínimo do vetor: ");
            valorMinimo = sc.nextInt();
            System.out.print("\n Valor máximo do vetor: ");
            valorMax = sc.nextInt();
            if(valorMinimo > valorMax){
                System.out.println("ERRO: O valor máximo deve ser maior que o mínimo");
                continue;
            }

            //VALOR INDICATIVO DE POSIÇÃO VAGA
            System.out.print("\n Valor indicativo de posição vaga: ");
            posicaoVaga = sc.nextInt();
            if (posicaoVaga >= valorMinimo && posicaoVaga <= valorMax ){
                System.out.println("ERRO: O valor indicativo de posição vaga não pode estar no intervalo");
                continue;
            }

            //POSSIBILIDADE OU NÃO DE REPETIÇÃO
            System.out.print("\n Pode haver repetição de valores? (1) sim ou (2) não: ");
            repeticao = sc.nextInt();
            if (repeticao < 1 || repeticao > 2){
                System.out.println("ERRO: Valor inválido, informe 1 ou 2");
                continue;
            }

            break;
        }

        TadVetor vetor = new TadVetor(tamanho, valorMinimo, valorMax, posicaoVaga, repeticao);

        while (true){
            System.out.println("===================================");
            System.out.println("      ESTUDO DO TAD VETOR          ");
            System.out.println("===================================");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Atribuir um valor a determinada posicao");
            System.out.println("2 - Alterar um valor em determinada posicao");
            System.out.println("3 - Remover o valor de determinada posicao ");












        }
    }
}
