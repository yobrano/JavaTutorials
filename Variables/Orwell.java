import java.util.Scanner;

public class Orwell {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Year when animal farm was written:");
        int year = Integer.valueOf(reader.nextLine());
        if(year == 1984){
            System.out.println("Yes, it was written by Orwell.");
        }
        System.out.println("Interesting!");
    }
}