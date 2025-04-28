package TesteA1;

public class Biblioteca {
    public static void main(String[] args) {
        String nomeLivro1 = "Livro 1";
        String nomeLivro2 = "Livro 2";
        String autor1 = "Autor 1";
        String autor2 = "Autor 2";

        Livro livro1 = new Livro(autor1, nomeLivro1);
        Livro livro2 = new Livro(autor2, nomeLivro2);

        livro1.ExibirInformacoes();
        livro2.ExibirInformacoes();
    }
}
