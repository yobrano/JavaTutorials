import java.util.Scanner;

public class CountAndSummateInput {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        int number = 0;
        int count = 0;
        int total = 0;
        while (true) {
            System.out.println("Give a number (0 to Quit)");
            number = Integer.valueOf(reader.nextLine());
            if(number == 0){
                break;
            }
            total = total + number;
            count = count + 1;
            
        }
        System.out.println("Number of numbers: " + count + " Sum of numbers: "+ total);
        
    }
}
