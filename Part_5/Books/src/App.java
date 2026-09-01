import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner reader = new Scanner(System.in);
      ArrayList<Book> books = new ArrayList();

      while(true) {
         System.out.print("Book Title: ");
         String bookTitle = reader.nextLine();
         if (bookTitle.isEmpty()) {
            System.out.println();

            while(true) {
               System.out.print("Printing Mode: ");
               bookTitle = reader.nextLine();
               if (bookTitle.equals("everything") || bookTitle.equals("everything")) {
                  if (bookTitle.equals("everything")) {
                     for(Book book : books) {
                        System.out.println(book);
                     }
                  } else if (bookTitle.equals("name")) {
                     for(Book book : books) {
                        System.out.println(book.getTitle());
                     }
                  }

                  return;
               }

               System.out.println("Invalid print print mode. Options are either 'everything' or 'name'");
            }
         }

         System.out.print("Number of Pages: ");
         int numPages = Integer.valueOf(reader.nextLine());
         System.out.print("Year of Publish: ");
         int publishYear = Integer.valueOf(reader.nextLine());
         Book newBook = new Book(bookTitle, numPages, publishYear);
         if(books.contains(newBook)){
            System.out.println("This book is already on the list.");
         }else{
             books.add(newBook);
         }
      }
    }
}
