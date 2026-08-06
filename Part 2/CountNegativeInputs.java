import java.util.Scanner;

public class CountNegativeInputs {
    public static void main(String[] args){
Scanner reader = new Scanner(System.in);

        int entryCount = 0;
        while (true) {
            System.out.println("Give a number: ");
            int entry = Integer.valueOf(reader.nextLine());
            if(entry == 0){
                break;
            }
            if(entry < 0){
                entryCount = entryCount + 1; 
            }
        }
        
        System.out.println("Number of Negative Numbers: "+ entryCount);
        

    }
}
