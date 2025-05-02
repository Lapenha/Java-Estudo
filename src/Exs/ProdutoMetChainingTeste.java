package Exs;

public class ProdutoMetChainingTeste {
    public static void main(String[] args) {
        new ProdutoMetChaining()
                .setName("Abacate")
                .setCategoriaProduto("Frutas")
                .setQuantidadeProduto(10).
                printProdutos();
        new ProdutoMetChaining()
                .setName("Livro")
                .setCategoriaProduto("Livros")
                .setQuantidadeProduto(10)
                .printProdutos();
        new ProdutoMetChaining()
                .setName("Caixa")
                .setCategoriaProduto("Caixas")
                .setQuantidadeProduto(10)
                .printProdutos();
    }
}
