import java.util.Scanner;

public class ByTwoCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first = Integer.valueOf(reader.nextLine());
        System.out.println("Enter the second value: ");
        int second = Integer.valueOf(reader.nextLine());

        System.err.println(first + " + " + second + " = " + (first + second));
        System.err.println(first + " - " + second + " = " + (first - second));
        System.err.println(first + " x " + second + " = " + (first * second));
        System.err.println(first + " / " + second + " = " + (1.0 * first / second));
    }
}
