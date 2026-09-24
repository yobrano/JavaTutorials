import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // twoContainers();
        // testContainer();
        testInterface();
    }

    public static void testInterface(){
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.start();
    }

    public static void testContainer(){
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);

    }

    public static void twoContainers(){
        int firstContainer = 0;
        int secondContainer = 0;
        int capacity = 100;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First "+firstContainer+"/"+capacity+" Second "+secondContainer + " / "+capacity);
            String reader = scanner.nextLine();
            if(reader.equals("quit")){
                break;
            }

            String[] commands = reader.split(" ");
            String command = commands[0];
            int amount = Integer.valueOf(commands[1]);
            boolean isValuePositive = amount > 0;
            if(!isValuePositive){
                continue;
            }
            
            if(command.equals("add")){
                int tempTotal = amount + firstContainer;
                
                    boolean isNewTotalOverCapacity = tempTotal > capacity;
                    boolean isOldTotalOverCapacity = firstContainer > capacity;
                    if(isNewTotalOverCapacity || isOldTotalOverCapacity){
                        firstContainer = capacity;
                    }else{
                        firstContainer = tempTotal;
                    }
                
            }else if(command.equals("move")){
                int tempFirst = firstContainer - amount;
                boolean hasOverDrawnFirst = tempFirst < 0;
                if(hasOverDrawnFirst){
                    firstContainer = 0;
                }else{
                    firstContainer = tempFirst;
                }

                int tempSecond = secondContainer + amount;
                boolean isOldSecondOverCapacity = secondContainer > capacity;
                boolean isNewSecondOverCapacity = tempSecond > capacity;
                if(isOldSecondOverCapacity || isNewSecondOverCapacity){
                    secondContainer = capacity;
                }else{
                    secondContainer = tempSecond;
                }

            }else if(command.equals("remove")){

                int tempSecond = secondContainer - amount;
                boolean isSecondOverdrawn = tempSecond < 0;
                if(isSecondOverdrawn){
                    secondContainer = 0;
                }else{
                    secondContainer = tempSecond;
                }
            }


        }

        System.out.println("Out of the matrix.");

    }
}
