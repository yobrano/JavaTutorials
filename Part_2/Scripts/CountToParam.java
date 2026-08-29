import java.util.Scanner;

public class CountToParam {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int until = Integer.valueOf(reader.nextLine());
        printUnitlNumber(until);
    }   

    public static void printUnitlNumber(int until){
        for(int i = 1; i<=until; i++){
            System.out.println(i);
        }   
    }
    
    
}
