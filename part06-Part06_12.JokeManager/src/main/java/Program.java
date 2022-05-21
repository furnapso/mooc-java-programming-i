
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hello world");
        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        manager.addJoke("Just joking 3");
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
