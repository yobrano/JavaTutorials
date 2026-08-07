import java.util.Scanner;

public class SquarerootInput {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int total = first + second;
        double squareRoot = Math.sqrt(total);
        System.out.println(squareRoot);

    }
}
