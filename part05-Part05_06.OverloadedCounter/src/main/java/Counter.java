/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukeb
 */
public class Counter {
    private int value;
    
    public Counter(int value) {
        this.value = value;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value = this.value + 1;
    }
    
    public void decrease() {
        this.value = this.value - 1;
    }
    
    public void increase(int by) {
        if (by > 0) {
            this.value = this.value + by;
        }
    }
    
    public void decrease(int by) {
        if (by > 0) {
            this.value = this.value - by;
        }
    }
}
