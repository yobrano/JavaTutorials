import java.util.Scanner;

public class LegitAge {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your age:");
        int age = Integer.valueOf(reader.nextLine());
        if(age > 0 && age < 120){
            System.out.println("Okay!");
        }else{
            System.out.println("Impossible!");
        }
    }
    
}
