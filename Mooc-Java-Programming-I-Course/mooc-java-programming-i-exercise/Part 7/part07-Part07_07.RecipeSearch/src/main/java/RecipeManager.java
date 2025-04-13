import java.nio.file.Paths;
import java.util.*;

public class RecipeManager {
    private ArrayList<Recipe> recipes;
    public RecipeManager(){
        this.recipes= new ArrayList<>();
    }

    public void readFile(String fileName){
        try(Scanner inputFile= new Scanner(Paths.get(fileName))){
            while(inputFile.hasNextLine()){
                String recipeName = inputFile.nextLine();
                int cookingTime =  Integer.valueOf(inputFile.nextLine());

                Recipe recipe= new Recipe(recipeName,cookingTime);
                
                while(inputFile.hasNextLine()){
                    String ingredient= inputFile.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }
                this.recipes.add(recipe);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void searchName(String name){
        System.out.println("Recipes:");
        for(Recipe recipe:this.recipes){
            if(recipe.getName().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    public void searchCookingTime(int time){
        System.out.println("Recipes:");

        for(Recipe recipe:this.recipes){
            if(recipe.getCookingTime() <= time){
                System.out.println(recipe);
            }
        }
    }
    public void searchIngredient(String name){
        System.out.println("Recipes:");
        for(Recipe recipe:this.recipes){
            if(recipe.getIngredients().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    public void printRecipes(){
        System.out.println("Recipes:");

        for(Recipe recipe:this.recipes){
            System.out.println(recipe);    
        }
    }

}
