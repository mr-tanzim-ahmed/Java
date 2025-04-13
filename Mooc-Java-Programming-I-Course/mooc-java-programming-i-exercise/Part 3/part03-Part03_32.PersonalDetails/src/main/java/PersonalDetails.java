import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int maxLength = 0;
        int count =0;
        int sum=0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break; 
            }

            String pieces[] = text.split(",");
            String name = pieces[0];  
            count++;
            sum = sum+ Integer.valueOf(pieces[1]);
            int length = name.length(); 

            if (length > maxLength) {
                maxLength = length;
                longestName = name;
            }
        }
        double avg = 1.0*sum/count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: "+avg);

        scanner.close();
    }
}
