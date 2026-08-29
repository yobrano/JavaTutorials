import java.util.Scanner;
public class HoleInGround {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times?");
        int iter = Integer.valueOf(reader.nextLine());
        for(int i= 0; i<iter; i++){
            printText();
        }
    }

    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
