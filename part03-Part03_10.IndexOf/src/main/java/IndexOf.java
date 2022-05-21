
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int searchFor = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchFor) {
                indexes.add(i);
            }
        }
        
        for (int i: indexes) {
            System.out.println(searchFor + " is at index " + i);
        }

        // implement here finding the indices of a number
    }
}
