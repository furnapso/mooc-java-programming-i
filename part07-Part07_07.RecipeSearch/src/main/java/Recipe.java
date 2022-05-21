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
public class Recipe {

    private String name;
    private ArrayList<String> ingredients;
    private int cookingTime;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String value = this.name + ", cooking time: " + this.cookingTime + ".";
        return value;
    }

}
