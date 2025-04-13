import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan =  scan;
        this.dictionary =  dictionary;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = this.scan.nextLine();

            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(word.equals("add")){
                add();
            }else if(word.equals("search")){
                search();
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    public void add(){
        System.out.println("Word: ");
        String word = scan.nextLine();

        System.out.println("Translation: ");
        String translation = scan.nextLine();

        this.dictionary.add(word,translation);
    }
    public void search(){
        System.out.println("To be translated: ");
        String toTranslate= scan.nextLine();

        String translation =this.dictionary.translate(toTranslate);

        if(translation == null){
            System.out.println("Word " + toTranslate + " was not found");

        }else{
            System.out.println("Translation: "+translation);
        }
    }

}
