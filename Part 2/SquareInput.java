import java.util.Scanner;

public class SquareInput{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("A number to square: ");
        int number = Integer.valueOf(reader.nextLine());
        System.out.println("Square: " + (number * number));
    }
}