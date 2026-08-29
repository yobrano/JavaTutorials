import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner promptReader = new Scanner(System.in);
        System.out.print("What file: ");
        
        Path filePath = Paths.get(promptReader.nextLine());
        Persons persons = new Persons(filePath);
        System.out.println(persons);
        promptReader.close();
    }

}
