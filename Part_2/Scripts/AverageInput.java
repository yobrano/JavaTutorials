import java.util.Scanner;

public class AverageInput {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int count = 0;
        int total = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number or O");
            number = Integer.valueOf(reader.nextLine());
            if(number == 0){
                break;
            }

            count = count + 1;
            total = total + number;
        }

        average = (double)total / count;
        System.out.println("Average of the numbers: "+ average);
    }
}
