import java.util.*;

public class UserInterface {
    private BirdManager manager;
    private Scanner scan;

    public UserInterface(BirdManager manager, Scanner scanner){
        this.manager= manager;
        this.scan= scanner;
    }
    public void start(){
        while(true){
            String command= askInput("command");
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                add();

            }else if(command.equals("Observation")){
                observation();

            }else if(command.equals("One")){
                one();

            }else if(command.equals("All")){
                this.manager.print();
            }else{
                System.out.println("Unknown command");
            }
        }
    }
        public String askInput(String inputType){
            if (inputType.equals("command")) {
                System.out.print("? ");
            } else if (inputType.equals("bird")) {
                System.out.print("Bird? ");
            } else if (inputType.equals("latin")) {
                System.out.print("Name in Latin: ");
            }
            return this.scan.nextLine();
        }

        public void add(){
            String bird= askInput("bird");
            String latinName = askInput("latin");
            this.manager.addBird(bird,latinName);
        }
        public void observation(){
            String bird= askInput("bird");
            
            boolean observationCheck = this.manager.addObservation(bird);
            if(!observationCheck){
                System.out.println("noot a bird!");
            }
        }
        public void one(){
            String name = askInput("bird");
            this.manager.print(name);
        }
     
}

