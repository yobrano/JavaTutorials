import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Whats your speed?");
        int speed = Integer.valueOf(reader.nextLine());
        if(speed > 180){
            System.out.println("Speed Ticket!");
        }
        System.out.println("Remember to drive safely.");
        
    }
}
