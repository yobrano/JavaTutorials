import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String first = reader.nextLine();
        String second = reader.nextLine();

        if(first.equals(second)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
