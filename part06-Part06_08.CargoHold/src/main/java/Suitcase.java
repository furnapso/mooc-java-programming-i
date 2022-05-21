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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if ((item.getWeight() + totalWeight()) > maxWeight) {
            return;
        }
        
        items.add(item);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item i: items) {
            totalWeight += i.getWeight();
        }
        
        return totalWeight;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String s = "";
        if (items.size() > 1) {
            s = "s";
        }
        return items.size() + " item" + s + " (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = items.get(0);
        
        for (Item i: items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        
        return heaviestItem;
    }
    
    public boolean isEmpty() {
        return items.size() == 0;
    }
    
    
    
    
}
