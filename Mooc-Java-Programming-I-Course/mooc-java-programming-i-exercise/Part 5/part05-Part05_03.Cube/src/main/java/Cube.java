public class Cube {
    private int edgeLength;
    public Cube(int edgeLength){
        this.edgeLength=edgeLength;
    }
    public int volume(){
        return edgeLength*edgeLength*edgeLength;
    }
    @Override
    public String toString(){
        return "The length of the edge is "+this.edgeLength+" and the volume "+String.valueOf(volume());
    }
}
