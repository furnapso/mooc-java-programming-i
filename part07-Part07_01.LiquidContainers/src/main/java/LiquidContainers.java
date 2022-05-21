
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                if (amount + container1 > 100) {
                    container1 = 100;
                } else {
                    container1 += Math.abs(amount);
                }
            } else if (input.contains("remove")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                if (amount > container2) {
                    container2 = 0;
                } else {
                    container2 -= Math.abs(amount);
                }
            } else if (input.contains("move")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                if (amount > container1) {
                    container2 += container1;
                    container1 = 0;
                } else {
                    container1 -= amount;
                    container2 += amount;
                }
                
                if (container2 > 100) {
                    container2 = 100;
                }
            }

        }
    }

}
