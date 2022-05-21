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
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                return;
            }
            
            if (input.equals("add")) {
                System.out.println("Task to add:");
                list.add(scanner.nextLine());
                continue;
            }
            
            if (input.equals("list")) {
                list.print();
                continue;
            }
            
            if (input.equals("remove")) {
                System.out.println("Task to be removed:");
                int taskId = Integer.valueOf(scanner.nextLine());
                list.remove(taskId);
                continue;
            }
        }
    }
}
