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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase i: suitcases) {
            totalWeight += i.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) > maxWeight) {
            return;
        }
        
        suitcases.add(suitcase);
    }
    
    public void printItems() {
        for (Suitcase i: suitcases) {
            i.printItems();
        }
    }
    
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        String s = "";
        
        if (suitcases.size() > 1) {
            s = "s";
        }
        
        return suitcases.size() + " suitcase" + s + " (" + totalWeight() + " kg)";
    }
}
