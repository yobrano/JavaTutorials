import java.util.Scanner;

public class CaputDraconis {
    public static void main(String[] args){
        String password = "Caput Draconis";
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the password Potter:");
        String passwordEntry = reader.nextLine();
        // String comparison.
        if(passwordEntry.equals(password)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
