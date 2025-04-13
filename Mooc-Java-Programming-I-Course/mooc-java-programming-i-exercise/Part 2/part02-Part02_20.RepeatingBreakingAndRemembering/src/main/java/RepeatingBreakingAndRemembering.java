
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        /* Implement a program that asks the user for numbers (the program 
        first prints "Write numbers: ") until the user gives the number -1. 
        When the user writes -1, the program prints "Thx! Bye!" and ends. */

        /* Extend the program so that it prints the sum of the numbers 
        (not including the -1) the user has written. */
        
        System.out.println("Give numbers:");
        
        // initialize counters and sums
        
        int counter = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;
        
        while (true) {
            
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }

            counter++;
            sum += number;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (1.0 * sum / counter));
        System.out.println("Even: " + counterEven);
        System.out.println("Odd: " + counterOdd);

    }
}