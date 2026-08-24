import java.nio.file.Path;
import java.util.Scanner;
import java.util.ArrayList;



public class GameStatistics {
    private ArrayList<Match> matches = new ArrayList<>();

    public GameStatistics(Path filePath) {
        try (Scanner fileScanner = new Scanner(filePath)) {
            while (fileScanner.hasNextLine()) {
                String[] row = fileScanner.nextLine().split(",");
                Match match = new Match(row[0], row[1], Integer.valueOf(row[2]), Integer.valueOf(row[3]));
                this.matches.add(match);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Match match: this.matches){
            result.append("\n").append(match.toString());
        }
        return result.toString();

    }
    public ArrayList<Match> getMatches(){
        return this.matches;
    }

    public int gamesCount(String teamName){
        int count = 0;

        for(Match match: this.matches){
            if(match.getHost().equals(teamName) || match.getVisitor().equals(teamName)){
                count++;
            }
        }

        return count;
    }

    public int gamesWon(String teamName){
        int count = 0;
        for(Match match: this.matches){
            if(match.getWinner().equals(teamName)){
                count++;
            }
        }
        return count;
    }

}
