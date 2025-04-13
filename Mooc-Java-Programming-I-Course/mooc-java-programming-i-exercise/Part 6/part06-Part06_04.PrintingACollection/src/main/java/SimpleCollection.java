
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString(){
        String prefix = "The collection "+this.name+" ";
        if(this.elements.isEmpty()){
            return prefix + "is empty.";
        }
        if(this.elements.size()==1){
            prefix= prefix + "has 1 element:";
        }
        else{
            prefix= prefix + "has " + this.elements.size() +" elements:";
        }

        for(String e:this.elements){
            prefix = prefix+"\n"+ e;
        }
        return prefix;
    }
}