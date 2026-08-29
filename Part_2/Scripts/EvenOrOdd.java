import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        double average = 0.0;
        int total = 0;

        while(true){
            int number = Integer.valueOf(reader.nextLine());
            if(number == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            count++;
            if(number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            
            total += number;
        }
        average =  (1.0 * total) / count;
        System.out.println("Sum: "+total);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+average);
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);


    }
}
