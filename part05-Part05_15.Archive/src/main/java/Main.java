
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();
        
        while (true) {
            String identifier = scanner.nextLine();
            
            if (identifier.equals("")) {
                break;
            }
            
            String name = scanner.nextLine();
            Item item = new Item(identifier, name);
            
            if (!list.contains(item)) {
                list.add(item);
            }
        }
        
        for (Item i: list) {
            System.out.println(i);
        }

    }
}
