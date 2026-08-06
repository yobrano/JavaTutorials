import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a number: ");
        int end = Integer.valueOf(reader.nextLine());
        int factorial = 1;
        for(int i= 1; i <= end; i++){
            factorial *= i;
        }
        System.out.println("Factorial: "+factorial);
    }    
}
