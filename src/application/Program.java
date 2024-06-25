package application;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos livros serão armazenados? ");
        int numLivros = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < numLivros; i++) {
            System.out.println("Insira os detalhes do livro " + (i + 1) + ":");
            System.out.print("Título: ");
            String title = scanner.nextLine();
            System.out.print("Autor: ");
            String authorName = scanner.nextLine();
            System.out.print("Nacionalidade do Autor: ");
            String nationality = scanner.nextLine();
            System.out.print("Gênero: ");
            String genre = scanner.nextLine();
            System.out.print("Ano: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            Author author = new Author(authorName, nationality);
            Book book = new Book(title, author, genre, year);
            library.addBook(book);
        }

        System.out.println("\nLivros armazenados na biblioteca:");
        List<Book> allBooks = library.getBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }

        scanner.close();
    }
}
