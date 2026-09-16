import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // testSimpleDictionary();
        testUI();
    }

    public static void testUI(){
        TextUI ui = new TextUI(new Scanner(System.in), new SimpleDictionary());
        ui.start();
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
