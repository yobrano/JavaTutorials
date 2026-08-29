import java.nio.file.Path;
import java.util.Scanner;
import java.util.ArrayList;

public class Persons {
    ArrayList<Person> persons = new ArrayList<>();
    
    public Persons(Path filePath){
        try(Scanner fileReader = new Scanner(filePath)){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] row  = line.split(",");
                Person person = new Person(row[0], Integer.valueOf(row[1]));
                this.persons.add(person);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Person person: this.persons){
            result.append("\n").append(person.toString());    
        }
        
        return result.toString();
    }
}
