import java.util.Scanner;

public class AveragePositiveInput {
    public static void main(String[] args){
            Scanner reader = new Scanner(System.in);
            int total = 0;
            int count = 0;
            double average = 1.0;

        while(true){
            System.out.println("Give a number (0 to Quit)");
            int number = Integer.valueOf(reader.nextLine());
            if(number == 0){
                break;
            }
            if(number > 0){
                total = total + number;
                count = count + 1;
            }
        }
        
        if(count == 0){
            System.out.println("Cannot calculate the average.");
        }else{
            average = 1.0 * (total / count);
            System.out.println("Average: "+ average);
        }
        
        
    }
}
