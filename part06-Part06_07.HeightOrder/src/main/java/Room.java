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
public class Room {
    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        return people.size() == 0;
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = people.get(0);
        
        for (Person i: people) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = shortest();
        
        people.remove(shortest);
        
        return shortest;
    }
}
