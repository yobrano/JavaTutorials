import java.util.Scanner;

public class ReadInNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        // Data conversion (str - double)
        double userEntry = Double.valueOf(scanner.nextLine());
        System.out.println("Value entered was "+ userEntry);
    }
}
