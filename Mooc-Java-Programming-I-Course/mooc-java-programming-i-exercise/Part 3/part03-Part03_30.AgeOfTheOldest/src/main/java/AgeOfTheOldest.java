import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ara = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String pieces[] = text.split(",");
            ara.add(Integer.valueOf(pieces[1]));
        }

        int max = ara.get(0);

        for (int i = 1; i < ara.size(); i++) {
            if (ara.get(i) > max) {
                max = ara.get(i);
            }
        }

        System.out.println("Age of the oldest: " + max);

        scanner.close();
    }
}
