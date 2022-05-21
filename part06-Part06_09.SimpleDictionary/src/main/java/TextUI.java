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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                return;
            }
            
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            
            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String term = scanner.nextLine();
                String translation = dictionary.translate(term);
                
                if (translation == null) {
                    System.out.println("Word " + term + " was not found");
                } else {
                    System.out.println(translation);
                }
                
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
}
