import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    public Stack(){
        this.list= new ArrayList<>();
    }
    public boolean isEmpty(){
        return this.list.size()<=0;
    }
    public void add(String value){
        this.list.add(value);
    }
    public ArrayList<String> values(){
        return this.list;
    }
    public String take(){
        int n= this.list.size()-1;
        String item=  this.list.get(n);
        this.list.remove(n);
        
        return item;
    
    }

}
