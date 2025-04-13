import java.util.*;

public class BirdManager{

    private ArrayList<Bird>birdDatabase;

    public BirdManager(){
        this.birdDatabase = new ArrayList<>();
    }
    public void addBird(String birdName, String latinName){
        this.birdDatabase.add(new Bird(birdName, latinName));
    }
    public boolean addObservation(String birdName){
        for(Bird bird:this.birdDatabase){
            if(bird.getName().equals(birdName)){
                bird.addObservation();
                return true;
            }
        }
        return false;
    }
    public void print(String birdName){
        for(Bird bird:this.birdDatabase){
            if(bird.getName().equals(birdName)){
                System.out.println(bird.toString());
            }
        }
    }
    public void print(){
        for(Bird bird:this.birdDatabase){
            System.out.println(bird.toString());
        }
    }
}