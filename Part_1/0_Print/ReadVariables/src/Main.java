import java.util.Scanner;

void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String number = reader.nextLine();
    System.out.println("Value can either be \n1 + "+ number + " = " +number + 1);
    double val1 = Double.valueOf(number);
    System.out.println("1 + "+ val1 + " = "+ (val1 + 1.0));
}
