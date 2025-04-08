import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;
    private WordSet wordset;
    
    public UserInterface(WordSet wordset,Scanner scanner){
        this.scanner= scanner;
        this.wordset = wordset;
    }
    
    public void start(){
        while(true){
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            if(alreadyEntered(word)){
            break;
        }
            this.wordset.add(word);
        }
        System.out.println("Twice!");
    }
    
    public boolean alreadyEntered(String word){
        return this.wordset.contains(word);
    }
}