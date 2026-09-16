import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("end")){
                break;
            }

            if(command.equals("add")){
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                if(word.isEmpty()){
                    System.out.println("No word povided. Entry not added to dictionary.");
                    continue;
                }
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                if(translation.isEmpty()){
                    System.out.println("No word povided. Entry not added to dictionary.");
                    continue;
                }
                this.dictionary.add(word, translation);
                continue;
            }else if(command.equals("search")){
                System.out.print("Searching for: ");
                String word = this.scanner.nextLine();
                String result = this.dictionary.search(word);
                if(result == null){
                    System.out.println("Word "+ word +" was not found.");
                }
                System.out.println("Translation: "+word);
                continue;
            }

            System.out.println("Unknown Command");

        }
        System.out.println("Bye Bye!!");  
    }
}
