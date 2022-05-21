/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author lukeb
 */
public class Database {
    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addObservation(String name) {
        for (Bird i: this.birds) {
            if (i.getName().equals(name)) {
                i.addObservation();
                return;
            }
        }
    }
    
    public void printAll() {
        for (Bird i: this.birds) {
            System.out.println(i);
        }
    }
    
    public Bird getBirdByName(String name) {
        for (Bird i: this.birds) {
            if (i.getName().equals(name)) return i;
        }
        
        return null;
    }
}
