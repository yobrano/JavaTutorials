public class App {
    public static void main(String[] args) throws Exception {
        testSimpleDictionary();
    }

    public static void testSimpleDictionary(){
                SimpleDictionary book = new SimpleDictionary();
                book.add("one", "yksi");
                book.add("two", "kaksi");

                System.out.println(book.translate("one"));
                System.out.println(book.translate("two"));
                System.out.println(book.translate("three"));

    }
}
