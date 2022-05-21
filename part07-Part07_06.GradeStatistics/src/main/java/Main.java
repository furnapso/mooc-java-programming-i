
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            stats.add(input);
        }
        
        System.out.println("Point average (all): " + stats.getAverage());
        
        double passAverage = stats.getPassingAverage();
        String passAverageStr = "-";
        
        if (passAverage > 0) {
            passAverageStr = "" + passAverage;
        }
        
        System.out.println("Point average (passing): " + passAverageStr);
        System.out.println("Pass percentage: " + stats.passPercentage());
        System.out.println("Distribution:\n" + stats.gradeDistribution());
    }
}
