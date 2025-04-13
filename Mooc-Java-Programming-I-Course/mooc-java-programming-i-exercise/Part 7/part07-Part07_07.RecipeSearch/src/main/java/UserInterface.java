import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private RecipeManager manager;

    public UserInterface(RecipeManager manager, Scanner scan){
        this.scan=scan;
        this.manager=manager;
    }
    public void start(){
        System.out.println("File to read: ");
        String fileName = scan.nextLine();
        this.manager.readFile(fileName);

        while(true){
            System.out.println("Enter a command: ");
            String command = scan.nextLine();

            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                this.manager.printRecipes();

            }else if(command.equals("find name")){
                System.out.println("Searched word:");
                String recipeName = scan.nextLine();
                this.manager.searchName(recipeName);

            }else if(command.equals("find cooking time")){
                System.out.println("Ingredient:");
                int recipeTime = Integer.valueOf(scan.nextLine());
                this.manager.searchCookingTime(recipeTime);

            }else if(command.equals("find ingredient")){
                System.out.println("Searched word:");
                String ingredient = scan.nextLine();
                this.manager.searchIngredient(ingredient);

            }else{
                System.out.println("Unknown command");
            }
        }
    }
    public void menu(){
        System.out.println("Commands:\n"
            +"list - lists the recipes\n"
            +"stop - stops the program\n"
            +"find name - searches recipes by name\n"
            +"find cooking time - searches recipes by cooking time");
    }
}
