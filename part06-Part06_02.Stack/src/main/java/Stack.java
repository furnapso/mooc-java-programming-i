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
public class Stack {
    private ArrayList<String> list;

    public Stack() {
        list = new ArrayList<>();
    }
    
    public void add(String value) {
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        String value = list.get(list.size() - 1);
        list.remove(value);
        return value;
    }
    
    public boolean isEmpty() {
        return list.size() == 0;
    }
    
}
