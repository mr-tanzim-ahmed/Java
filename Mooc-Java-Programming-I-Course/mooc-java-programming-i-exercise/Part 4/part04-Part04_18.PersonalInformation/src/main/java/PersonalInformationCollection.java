
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String firstName= scanner.nextLine();
            if(firstName.isEmpty()){
            break;
            }
        
            String lastName= scanner.nextLine();
            String id= scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        for(PersonalInformation a:infoCollection){
            System.out.println(a.getFirstName()+" "+a.getLastName());
        }
    }
}
