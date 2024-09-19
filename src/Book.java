import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;
    private List<Book> livros = new ArrayList<Book>();
    // Constructor
    public Book(List<Book> livros) {
        this.title = "";
        this.author = "";
        this.userRating = "";
        this.reviews = "";
        this.price = "";
        this.year = "";
        this.genre = "";
        this.livros = livros;
    }
    public Book(String title, String author, String userRating, String reviews, String price, String year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }


    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUserRating() {
        return userRating;
    }

    public String getReviews() {
        return reviews;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println(); // Add a newline for better readability between books
    }

    public int numberOfBookByAuthor(List<Book> livros, String author) {
        int count = 0;

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    public String toString() {

        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", userRating='" + userRating + '\'' +
                ", reviews='" + reviews + '\'' +
                ", price='" + price + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }



    public int NumeroLivrosPorAutor(String autor) {

        Set<String> unicos = new HashSet<>();

        for (Book x : livros) {
            if (x.getAuthor().equals(autor)) {
                unicos.add(x.getTitle());
            }
        }
        System.out.println("Número total de livros únicos de " + autor + ": " + unicos.size());
        return 0;
    }
    public int TodosAutores(){
        ArrayList<String> autores = new ArrayList<>();
        for (Book x : livros) {
            if (!autores.contains(x.getAuthor())) {
                autores.add(x.getAuthor());
            }
        }
        for (String autor : autores) {
            System.out.println(autor);
        }
        return 0;

    }
    public int TodosTitulosPorAutor(String autor){
        ArrayList<String> livrosPorAutor = new ArrayList<>();

        for (Book x : livros) {
            if(x.getAuthor().equals(autor)) {
                if(!livrosPorAutor.contains(x.getTitle())) {
                    livrosPorAutor.add(x.getTitle());
                }
            }
        }
        for (String livro : livrosPorAutor) {
            System.out.println(livro);
        }
        return 0;
    }
    public int ClassificarPorAvaliacao(String avaliacao){

        ArrayList<Book> livrosAutoresPorAvaliacao = new ArrayList<>();
        ArrayList<String> titulosAutores = new ArrayList<>();

        for (Book x : livros) {
            if (x.getUserRating().equals(avaliacao)) {
                if (!titulosAutores.contains(x.getTitle())) {
                    titulosAutores.add(x.getTitle());
                    livrosAutoresPorAvaliacao.add(x);
                }
            }
        }
        for (Book livro : livrosAutoresPorAvaliacao) {
            System.out.println(livro.getTitle() + " de " + livro.getAuthor());
        }
        return 0;
    }
    public int NomePrecoPorAutor(String autor) {
        ArrayList<Book> nomePrecoAutor = new ArrayList<>();
        ArrayList<String> titulosUsados = new ArrayList<>();
        //itera sobre livros
        for (Book x : livros) {
            //se o titulo for igual o autor
            if (x.getAuthor().equals(autor)) {
                //se o titulo nao esta em titulosUsados, adiciona livro e titulo logo filtra por tituol
                if (!titulosUsados.contains(x.getTitle())) {
                    titulosUsados.add(x.getTitle());
                    nomePrecoAutor.add(x);
                }
            }
        }
        //pega o livro da lista que foi filtrada por nome
        for (Book livro : nomePrecoAutor) {
            System.out.println(livro.getTitle() + " - " + livro.getPrice());
        }

        return 0;
    }

}