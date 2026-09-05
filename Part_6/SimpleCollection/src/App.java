public class App {
    public static void main(String[] args) throws Exception {
        testCollection();
    }

    public static void testCollection(){
        SimpleCollection authors = new SimpleCollection("Authors");
        System.out.println(authors);
        authors.add("Hellen");
System.out.println(authors);
        authors.add("Zaffon");

        authors.add("Clear");

        authors.add("Robert");

        authors.add("Graham");
    
    System.out.println(authors);
    }
}
