/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukeb
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double newBalance = this.balance - 2.60;
        if (newBalance >= 0) {
            this.balance = newBalance;
        }
    }
    
    public void eatHeartily() {
        double newBalance = this.balance - 4.60;
        if (newBalance >= 0) {
            this.balance = newBalance;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        
        double newBalance = this.balance + amount;
        
        if (newBalance > 150) {
            this.balance = 150;
        } else {
            this.balance = newBalance;
        }
    }
}
