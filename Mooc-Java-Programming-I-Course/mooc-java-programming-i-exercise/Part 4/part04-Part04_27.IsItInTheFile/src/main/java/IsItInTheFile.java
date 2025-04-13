
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fileContent =  new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner scan= new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                fileContent.add(line);
            }
        }catch(Exception e){
            System.out.println("Reading the file "+e.getMessage()+" failed.");
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if(fileContent.contains(searchedFor)){
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found.");
        }
    }
}
