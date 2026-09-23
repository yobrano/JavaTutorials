import java.util.Scanner;

public class App {
    public static void main(String[] args){
        testUserInterface();
    }
    public static void testUserInterface(){
        UserInterface ui = new UserInterface(new TodoList(), new Scanner(System.in));
        ui.start();
    }

    public static void testTasks(){
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

    }
}
