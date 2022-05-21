/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author lukeb
 */
public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("X")) {
                return;
            }
            
            if (input.equals("1")) {
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            }
            
            if (input.equals("2")) {
                System.out.println(jokes.drawJoke());;
            }
            
            if (input.equals("3")) {
                jokes.printJokes();
            }
        }

    }
}
