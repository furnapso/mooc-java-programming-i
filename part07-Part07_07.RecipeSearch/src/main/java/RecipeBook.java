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
public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipes() {
        for (Recipe i: recipes) {
            System.out.println(i + "\n");
        }
    }
    
    public String findRecipeByName(String recipeName) {
        String foundRecipes = "";
        for (Recipe i: this.recipes) {
            if (i.getName().contains(recipeName)) {
                foundRecipes += i.toString() + "\n";
            }
        }
        
        return foundRecipes.trim();
    }
    
    public String findRecipeByCookingTime(int time) {
        String foundRecipes = "";
        for (Recipe i: this.recipes) {
            if (i.getCookingTime() == time) {
                foundRecipes += i.toString() + "\n";
            }
        }
        
        return foundRecipes.trim();
    }
    
    public String findRecipeByIngredient(String ingredient) {
        String foundRecipes = "";
        for (Recipe i: this.recipes) {
            if (i.getIngredients().contains(ingredient)) {
                foundRecipes += i.toString() + "\n";
            }
        }
        
        return foundRecipes;
    }
}
