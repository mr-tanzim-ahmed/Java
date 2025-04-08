import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    public UserInterface(TodoList list, Scanner input){
        this.list = list;
        this.scan= input;
    }
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = this.scan.nextLine();

            if(command.equals("stop")){
                break;

            }else if(command.equals("add")){
                add();

            }else if(command.equals("list")){
                list();

            }else if(command.equals("remove")){
                remove();

            }else{
                System.out.println("Unknown command");
            }
        }
    }
    public void add(){
        System.out.println("To add: ");
        String task = this.scan.nextLine();

        this.list.add(task);
    }
    public void list(){
        this.list.print();
    }
    public void remove(){
        System.out.println("Which one is removed? ");
        int i = Integer.valueOf(this.scan.nextLine());
        this.list.remove(i);
    }

}
