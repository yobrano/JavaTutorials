import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        testGradeRegister();
    }

    public static void testGradeRegister() {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();
    }

}
