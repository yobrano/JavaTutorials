import java.util.Scanner;

public class SumSequence {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Sum untill what number:");
        int end = Integer.valueOf(reader.nextLine());
        int total = 0;

        for(int i =0;i <= end; i++){
            total += i;
        }
        System.out.println(total);
    }
}
