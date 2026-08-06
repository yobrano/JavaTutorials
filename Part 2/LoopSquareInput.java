import java.util.Scanner;

public class LoopSquareInput{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Give a number:");
            
            number = Integer.valueOf(reader.nextLine());
            if(number < 0){
                System.out.println("Unsuitable number.");
                continue;
            }else if(number == 0){
                break;

            }else{
                System.out.print(number * number + " ");
            }
        }
    }
}