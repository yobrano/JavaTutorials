import java.util.Scanner;

public class AgeInDays {
    public static void ageCalc(){

            Scanner reader = new Scanner(System.in);

            System.out.println("What is your age in years:");
            double age = Double.valueOf(reader.nextLine());
            System.out.println("In months you are " + age * 12 );
            System.out.println("Days " + age * 365.25);

            System.out.println("Next year a time like this you'll have lived  " + ((age + 1) * 365.25) );

    }
}
