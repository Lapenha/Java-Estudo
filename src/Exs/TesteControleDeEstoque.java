package Exs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteControleDeEstoque {
    public static void main(String[] args) {
        List<ControleDeEstoque> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGERENCIAMENTO DE ESTOQUE");
            System.out.println("1 -> Cadastrar produto");
            System.out.println("2 -> Exibir estoque");
            System.out.println("3 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt(); // Agora lê a opção dentro do loop

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine(); // consumir o \n pendente
                    String nomeProduto = sc.nextLine();

                    System.out.print("Digite o código do produto: ");
                    int codigoProduto = sc.nextInt();

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = sc.nextDouble();

                    System.out.print("Digite a quantidade no estoque: ");
                    int quantidadeEstoque = sc.nextInt();

                    ControleDeEstoque prod = new ControleDeEstoque(nomeProduto, codigoProduto, precoProduto, quantidadeEstoque);
                    produtos.add(prod);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Estoque vazio!");
                    } else {

                        System.out.println("\n--- ESTOQUE ---");
                        for (ControleDeEstoque produto : produtos) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
