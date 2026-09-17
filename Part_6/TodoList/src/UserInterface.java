import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList tasks; 
    public UserInterface(TodoList tasks, Scanner scanner){
        this.tasks = tasks;
        this.scanner = scanner;
    }


    private String readTerminal(String prompt){
        System.out.print(prompt);
        return this.scanner.nextLine();
    }
    public void start(){
        while(true){
            String command = this.readTerminal("Command: ");
            if(command.equals("end")){
                break;
            }else if(command.equals("add")){

            }else if(command.equals("list")){

            }else if(command.equals("remove")){

            }else{
                System.out.println("Unkonwn Command");
            }
            
        }

        System.out.println("See you latter.");
    }

}
