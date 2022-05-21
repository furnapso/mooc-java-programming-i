/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukeb
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String toString() {
        return identifier + ": " + name;
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (compare instanceof Item) {
            Item compareItem = (Item) compare;
            
            return identifier.equals(compareItem.identifier);
        }
        
        return false;
    }
}
