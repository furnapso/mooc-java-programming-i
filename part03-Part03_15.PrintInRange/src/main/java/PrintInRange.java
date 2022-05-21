
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, 
            int lowerLimit, int upperLimit) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i: numbers) {
            if (i >= lowerLimit && i <= upperLimit) {
                list.add(i);
            }
        }
        
        for (int i: list) {
            System.out.println(i);
        }
    }
    
}
