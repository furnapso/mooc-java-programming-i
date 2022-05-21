
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        String team = scan.nextLine();

        int numGames = 0;
        int wonGames = 0;

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");
                String home = parts[0];
                String visiting = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                String winner;

                if (homePoints > visitPoints) {
                    winner = home;
                } else {
                    winner = visiting;
                }

                if (home.equals(team) || visiting.equals(team)) {
                    numGames = numGames + 1;
                }

                if (winner.equals(team)) {
                    wonGames = wonGames + 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Games: " + numGames);
        System.out.println("Wins: " + wonGames);
        System.out.println("Losses: " + (numGames - wonGames));
    }

}
