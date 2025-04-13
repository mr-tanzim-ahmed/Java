import java.util.ArrayList;

public class TodoList {
    private ArrayList<String>tasks;

    public TodoList(){
        this.tasks=  new ArrayList<>();
    }
    public void add(String add){
        this.tasks.add(add);
    }

    public void print(){
        int i=1;
        for(String e:this.tasks){
            System.out.println(i+": "+e);
            i++;
        }
    }
    public void remove(int i){
        i--;
        this.tasks.remove(i);
    }
}
