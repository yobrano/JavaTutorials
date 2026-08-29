import java.util.Scanner;

public class SummateInputs {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        int number = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a number (0 to Quit):");
            number = Integer.valueOf(reader.nextLine());
            if(number == 0){
                break;
            }
            total = total + number;
        }

        System.out.println("Total : " + total);
        
    }
}
