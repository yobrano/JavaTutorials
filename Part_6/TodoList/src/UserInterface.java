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
                String task = this.readTerminal("To Add: ");
                this.tasks.add(task);
            }else if(command.equals("list")){
                    this.tasks.print();
            }else if(command.equals("remove")){
                int index = Integer.valueOf(this.readTerminal("To remove: "));
                this.tasks.remove(index);
            }else{
                System.out.println("Unkonwn Command");
            }
            
        }

        System.out.println("See you latter.");
    }

}
