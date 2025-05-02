package Exs;

public class ProdutoMetChaining {
    private String nomeProduto;
    private String categoriaProduto;
    private int quantidadeProduto;


    public ProdutoMetChaining setName(String name){
        this.nomeProduto = name;
        return this;
    }
    public ProdutoMetChaining setCategoriaProduto(String categoria){
        this.categoriaProduto = categoria;
        return this;
    }
    public ProdutoMetChaining setQuantidadeProduto(int quantidade){
        this.quantidadeProduto = quantidade;
        return this;
    }
    public void  printProdutos(){
        System.out.printf("Produto %s\nCategoria: %s\nQuantidade no estoque: %d\n\n",
                nomeProduto, categoriaProduto, quantidadeProduto);
    }

}
