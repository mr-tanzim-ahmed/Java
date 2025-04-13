import java.util.*;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String>ingredients;

    public  Recipe(String name, int items){
        this.recipeName= name;
        this.cookingTime= items;
        this.ingredients= new ArrayList<>();
    }

    public void addIngredients(String items){
        this.ingredients.add(items);
    }
    public String getName(){
        return this.recipeName;
    }
    public int getCookingTime(){
        return this.cookingTime;
    }
    public ArrayList<String>getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return this.recipeName+", cooking time: "+this.cookingTime;
    }
}
