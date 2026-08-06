import java.util.Scanner;

public class SumBetween {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int start = Integer.valueOf(reader.nextLine());

        System.out.print("Enter the ending point: ");
        int end = Integer.valueOf(reader.nextLine());

        int total = 0;
        for(int i = start; i <= end; i++){
            total += i;
        }
        System.out.println("Total: " + total);

    }    
}
