public class App {
    public static void main(String[] args) throws Exception {
        SimpleDate day = new SimpleDate(29, 12, 2026);
        day.advance();
        day.advance();
        System.out.println(day.afterNoDays(10)
        );
    }
}
