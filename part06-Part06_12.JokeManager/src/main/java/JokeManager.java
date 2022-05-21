/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author lukeb
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public void printJokes() {
        for (String i: this.jokes) {
            System.out.println(i);
        }
    }
    
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        
        return jokes.get(rand.nextInt(jokes.size()));
    }
}
