
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                String years;
                if (age == 1) {
                    years = "year";
                } else {
                    years = "years";
                }
                
                System.out.println(name + ", age: " + age + " " + years);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
