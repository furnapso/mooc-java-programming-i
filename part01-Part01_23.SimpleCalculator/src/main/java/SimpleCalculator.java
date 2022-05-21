
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int minus = firstNumber - secondNumber;
        int plus = firstNumber + secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division =  firstNumber / (secondNumber * 1.0);
        
        System.out.println(firstNumber + " + " + secondNumber + " = " + plus);
        System.out.println(firstNumber + " - " + secondNumber + " = " + minus);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
