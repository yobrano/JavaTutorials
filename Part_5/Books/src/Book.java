public class Book {
   private String title;
   private int pageCount;
   private int publicationYear;

   public Book(String bookTitle, int numPages, int yearOfPublication) {
      this.title = bookTitle;
      this.pageCount = numPages;
      this.publicationYear = yearOfPublication;
   }

   public String toString() {
      return this.title + ", Pages: " + this.pageCount + ", Year: " + this.publicationYear;
   }

   public String getTitle() {
      return this.title;
   }

   public int getPages(){
      return this.pageCount;
   }

   public int getPublicationYear(){
      return this.publicationYear;
   }

   public boolean equals(Object other){
      if(other == this){
         return true;
      }

      if(!(other instanceof Book)){
         return false;
      }

      Book otherBook = (Book) other;
      if(
         (this.pageCount == otherBook.getPages())&&
         (this.publicationYear == otherBook.getPublicationYear())&&
         (this.title.equals(otherBook.getTitle()))
      ){
         return true;
      }


      return false;

   }
}
