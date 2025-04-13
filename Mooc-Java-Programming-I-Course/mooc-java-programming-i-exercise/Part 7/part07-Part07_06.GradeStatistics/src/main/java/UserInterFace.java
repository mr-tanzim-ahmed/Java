import java.util.Scanner;

public class UserInterFace {
    private Scanner scanner;
    private Grade grade;

    public UserInterFace(Grade grade, Scanner scan){
        this.grade = grade;
        this.scanner= scan;
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
    

        while (true) {
            int number =  Integer.valueOf(this.scanner.nextLine());
            if(number==-1){
                break;
            }
            this.grade.addPoints(number);
        }
        this.grade.printStars();
        this.grade.printGradeDistribution();
    }
}
