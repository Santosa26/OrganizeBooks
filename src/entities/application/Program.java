package application;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Library library = new Library();

        // Adicionando autores e livros
        Author author1 = new Author("J.K. Rowling", "British");
        Author author2 = new Author("George R.R. Martin", "American");

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "Fantasy", 1997);
        Book book2 = new Book("A Game of Thrones", author2, "Fantasy", 1996);

        library.addBook(book1);
        library.addBook(book2);

        // Pesquisando livros
        System.out.println("Books by J.K. Rowling:");
        List<Book> booksByRowling = library.searchByAuthor("J.K. Rowling");
        for (Book book : booksByRowling) {
            System.out.println(book);
        }

        System.out.println("\nBooks with 'Game' in the title:");
        List<Book> booksWithTitleGame = library.searchByTitle("Game");
        for (Book book : booksWithTitleGame) {
            System.out.println(book);
        }
    }
}
