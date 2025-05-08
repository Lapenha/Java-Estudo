package Estudo;

public record Book(String title, String author, int year) { //construtor record
    public Book(String title, String author) { // construtor extra
        this(title, author, -1);
        if(title == null || author == null) { //valida se um dos dois é nulo
            throw new IllegalArgumentException("Book title and author are required"); //se algum for nulo retorna esse erro
        }
    }
    public String bookType(){
        return year < 1980 ? "Livro clássico" : "Livro Atual"; //verifica se é classico

    }
    public static Book fromCSV(String line){  //cria uma linha com titulo, autor, e ano
        String[] parts = line.split(",", 3);
        String title = parts[0];
        String author = parts[1];
        String year = parts[2];
        return new Book(title, author, Integer.parseInt(year));
    }

}

class BookTeste{
    public static void main(String[] args) {
        Book book1 = new Book("A arte da guerra", "Sun Tzu", 1980);
        Book book2 = new Book("Sei la", "Pedro");
        String csvLine = "O senhor dos Aneis,J.R.R. Tolkien,1954";
        Book book3 = Book.fromCSV(csvLine);

        System.out.printf("Book Title: %s\nAuthor: %s\nYear: %d\n", book1.title(), book1.author(), book1.year());
        System.out.println(book1.bookType());


        System.out.printf("Book Title: %s\nAuthor: %s\nYear: %d\n", book2.title(), book2.author(), book2.year());
        System.out.println(book2.bookType());

        System.out.println(book3);

    }
}