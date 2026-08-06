import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("To where? ");
        int end = Integer.valueOf(reader.nextLine());
        System.out.print("From where? ");
        int start = Integer.valueOf(reader.nextLine());
        for(int i = start; i<=end; i++){
            System.out.println(i);
        }

    }
}
