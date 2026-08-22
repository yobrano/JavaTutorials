import java.util.Scanner;;
public class LeapYearChecker {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Year to check:");
        int year = Integer.valueOf(reader.nextLine());
        boolean isLeapYear = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0) ;
        if(isLeapYear){
            System.out.println("It is a leap year.");
        }else{
            System.out.println("It is NOT a leap year.");
        }
        // if(! isLeapYear){
        //     System.out.println("Not a leap year!");
        // }else if(isLeapYear){
        //     if((year % 100) == 0){
        //         if((year % 400) == 0){
        //             System.out.println("It is a leap year!");   
        //         }else{
        //         System.out.println("Not a leap year!");

        //         }
        //     }else{
        //         System.out.println("It is a leap year!");
        //     }
        // }
    }
}
