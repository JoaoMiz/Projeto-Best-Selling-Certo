import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> livros = new DatasetReader().readDataset("src/data.csv");

        Book livro = new Book(livros);

        /*
        livro.NumeroLivrosPorAutor("J.K. Rowling");
        livro.TodosAutores();
        livro.TodosTitulosPorAutor("J.K. Rowling");
        livro.ClassificarPorAvaliacao("4.1");
        livro.NomePrecoPorAutor("George R. R. Martin");
        */
        livro.TodosTitulosPorAutor("J.K. Rowling");


        }
    }
