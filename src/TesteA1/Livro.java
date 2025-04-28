package TesteA1;

 class Livro {
     private String nomeLivro;
     private String autor;

     public Livro(String nomeLivro, String autor) {
         this.nomeLivro = nomeLivro;
         this.autor = autor;
     }

     public String getNomeLivro() {
         return nomeLivro;
     }
     public void setNomeLivro(String nomeLivro) {
         this.nomeLivro = nomeLivro;
     }
     public String getAutor() {
         return autor;
     }
     public void setAutor(String autor) {
         this.autor = autor;
     }
     public void ExibirInformacoes() {
        System.out.println("Nome: " + getNomeLivro() + "\n" + "Autor: " + getAutor() + "\n");
     }
}
