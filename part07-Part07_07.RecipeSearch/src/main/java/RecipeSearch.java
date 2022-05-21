
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        
        RecipeBook recipes = readRecipes(file);

        while (true) {
            System.out.println("\nCommands:" + "\nlist - lists the recipes"
                    + "\nstop - stops the program\nfind name - searches recipe by"
                    + " name\nfind time - searches recipe by cooking time\n" + 
                    "find ingredient - searches recipe by ingredient\n");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("list")) {
                System.out.println("");
                recipes.printRecipes();
            }
            
            if (input.equals("find name")) {
                System.out.println("");
                System.out.println("Search for:");
                String searchTerm = scanner.nextLine();
                System.out.println("");
                System.out.println(recipes.findRecipeByName(searchTerm));
            }
            
            if (input.equals("find time")) {
                System.out.println("");
                System.out.println("Search for:");
                int searchTerm = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println(recipes.findRecipeByCookingTime(searchTerm));
            }
            
        }
    }

    public static RecipeBook readRecipes(String fileName) {
        RecipeBook recipeBook = new RecipeBook();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            Recipe recipe = null;
            boolean newRecipe = true;
            while (fileScanner.hasNextLine()) {
                String nextLine = fileScanner.nextLine();

                if (newRecipe) {
                    recipe = new Recipe(nextLine, Integer.valueOf(fileScanner.nextLine()));
                    newRecipe = false;
                    continue;
                } else if (nextLine.equals("") || !fileScanner.hasNextLine()) {
                    newRecipe = true;
                    recipeBook.addRecipe(recipe);
                    continue;
                } else {
                    recipe.addIngredient(nextLine);
                }
            }
            
            return recipeBook;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
