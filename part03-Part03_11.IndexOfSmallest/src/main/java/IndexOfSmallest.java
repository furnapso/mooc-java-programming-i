
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            
            list.add(input);
        }
        
        int smallest = list.get(0);
        
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i) < smallest) {
                 smallest = list.get(i);
                 indexes.add(i);
             }
         }
         
         System.out.println("Smallest number: " + smallest);
         
         for (int i: indexes) {
             System.out.println("Found at index: " + i);
         }
        
    }
}
