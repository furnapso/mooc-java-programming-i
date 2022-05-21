
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database db = new Database();
        
        while (true) {
            System.out.println("Command:");
            String input = scan.nextLine();
            
            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                db.addBird(new Bird(name, latinName));
            }
            
            if (input.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                db.addObservation(name);
            }
            
            if (input.equals("All")) {
                db.printAll();
            }
            
            if (input.equals("One")) {
                System.out.println("Name?");
                String name = scan.nextLine();
                System.out.println(db.getBirdByName(name));
            }
            
            if (input.equals("Quit")) {
                break;
            }
        }
    }

}
