import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String>jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int i = draw.nextInt(jokes.size());
        return jokes.get(i);
    }
    public void printJokes(){
        for(String j: jokes){
            System.out.println(j);
        }
    }
}
