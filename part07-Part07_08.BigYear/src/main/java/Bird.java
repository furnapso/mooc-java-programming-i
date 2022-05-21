/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukeb
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void addObservation() {
        this.observations += 1;
    }

    @Override
    public String toString() {
        String s = "";
        if (this.observations > 1 || this.observations == 0) {
            s = "s";
        }
        return this.name + " (" + this.latinName + "): " + this.observations + 
                " observation" + s + ".";
    }
    
    

}
