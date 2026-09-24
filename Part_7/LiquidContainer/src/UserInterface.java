import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container firstContainer;
    private Container secondContainer;
    private String help;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.firstContainer = new Container();
        this.secondContainer = new Container();  
        this.help = UserInterface.getHelp();
        
    }

    public static String getHelp(){
        Path path = Paths.get("./LiquidContainer/help.txt");
        String help = "";
        try {
            Scanner reader = new Scanner(path);
            while (reader.hasNextLine()) {
                help += reader.nextLine() + "\n";
            }
        } catch (Exception e) {
            System.out.println("An error occured while loaading the help message.");
            System.out.println(e);
            
        }

        return help;
    }


    public void start(){
        while (true) {
            System.out.println("First  : "+firstContainer);
            System.out.println("Second : "+secondContainer);
            String input = this.scanner.nextLine();
            if(input.equals("quit")){
                break;
            }else if(input.equals("help")){
                System.out.println(this.help);
                continue;
            }

            boolean hasSpace = input.contains(" ");
            if(!hasSpace){
                System.out.println("'" + input + "' is an invalid command. Enter 'help' for assistance.");
                continue;
            }

            String[] function = input.split(" ");
            String command = function[0];
            int amount = Integer.valueOf(function[1]);
            
            if(command.equals("add")){
                this.firstContainer.add(amount);
            }else if(command.equals("move")){
                int originalAmount = this.firstContainer.contains();
                this.firstContainer.remove(amount);
                int movedAmount = originalAmount - this.firstContainer.contains();
                this.secondContainer.add(movedAmount);
            }else if(command.equals("remove")){
                this.secondContainer.remove(amount);
            }else{
                System.out.println("'" + command + "' is an invalid command. Enter 'help' for assistance.");

            }
            
        }

        System.out.println("Chao !");
    }


}
