public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latin){
        this.name= name;
        this.latinName=latin;
        this.observations=0;
    }
    public void addObservation(){
        this.observations++;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name+" ("+this.latinName+"): "+this.observations+" observations";

    }
}
