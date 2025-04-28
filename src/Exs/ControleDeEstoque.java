package Exs;

public class ControleDeEstoque {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public ControleDeEstoque(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto: " + nome +
                " | Código: " + codigo +
                " | Preço: R$" + String.format("%.2f", preco) +
                " | Quantidade: " + quantidade;
    }
}
