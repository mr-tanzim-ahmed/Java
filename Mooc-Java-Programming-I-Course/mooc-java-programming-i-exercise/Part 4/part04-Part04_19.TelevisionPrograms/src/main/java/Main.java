
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Name:");
            String programName = scanner.nextLine();
            
            if (programName.isEmpty()) {
                break;
            }
            
            System.out.println("Duration:");
            int programDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(programName, programDuration));
        }

        // Max duration logic
        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();
        scanner.close();
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }

    }
}