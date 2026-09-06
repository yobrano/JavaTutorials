public class App {
    public static String yellowString(String text){
        // \u001B   - Strat listening to command
        // [        - Parameters of command starts here
        // 33       - Use font color Yellow
        // 0        - Reset font color.
        // m        - Stop Listening to command


        return "\u001B[33m" +text+"\u001B[0m";
    };
    public static void main(String[] args) throws Exception {
        testGift();
        testPackage();
    }

    public static void testGift(){

        System.out.println(yellowString("=== TESTING Gift ==="));
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);   
    }


    public static void testPackage(){
        System.out.println(yellowString("=== TESTING Package ==="));
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        System.out.println(gifts);
        gifts.addGift(book);
        System.out.println(gifts);
        gifts.addGift(book);
        gifts.addGift(book);
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
        System.out.println(gifts);

    }

}
