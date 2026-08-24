import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner promptScanner = new Scanner(System.in);
        System.out.print("File: ");
        Path filePath = Paths.get(promptScanner.nextLine());
        GameStatistics gameStats = new GameStatistics(filePath);
        // System.out.println(gameStats);

        // Print games Count:
        printGamesCount(gameStats);
        promptScanner.close();
    }


    public static void printGamesCount(GameStatistics gamesStats ){
        Scanner promptScanner = new Scanner(System.in);
        System.out.println("Team: ");
        String teamName =  promptScanner.nextLine();
        int gamesCount = gamesStats.gamesCount(teamName);
        
        System.out.println("Games: "+gamesCount);
        promptScanner.close();
    }
}
