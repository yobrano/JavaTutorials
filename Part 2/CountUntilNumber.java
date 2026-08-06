import java.util.Scanner;

public class CountUntilNumber {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a positive number to count to.");
        int end = Integer.valueOf(reader.nextLine());
        if(end < 0){
            System.out.println("Wrong entry. Use a positive number.");
        }else{
            for(int i= 0; i <= end; i++){
                System.out.println(i);
            }
        }

        
    }
}
