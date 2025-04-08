import java.util.*;
//Problem link https://java-programming.mooc.fi/part-6/2-separating-user-interface-from-program-logic

public class PalindromeWordRepeatingChecker {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        WordSet wordset = new WordSet();
        UserInterface userInterface= new UserInterface(wordset, scanner);
        userInterface.start();
        System.out.println("Number of palindromes entered: " + wordset.palindromes());
    }
}
