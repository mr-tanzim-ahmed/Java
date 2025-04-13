
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner scan= new Scanner(Paths.get(file))){
            while (scan.hasNext()) {
                String line= scan.nextLine();
                if(line.equals("")){
                    break;
                }
                String[] parts= line.split(",");
                String name= parts[0];
                int age= Integer.valueOf(parts[1]);

                String yearSuffix= "years";
                if(age==1){
                    yearSuffix= "year";
                }
                System.out.println(name+", age: "+age+" "+yearSuffix );
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
