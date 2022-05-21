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
public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Gift i: gifts) {
            weight += i.getWeight();
        }
        
        return weight;
    }
}
