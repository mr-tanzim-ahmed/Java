import java.util.ArrayList;

public class Grade{
        private ArrayList<Integer>points;
        private ArrayList<Integer>passingPoint;
        private ArrayList<Integer>grades;

        public Grade(){
            this.points = new ArrayList<>();
            this.passingPoint = new ArrayList<>();
            this.grades = new ArrayList<>();
        }

        public void addPoints(int point){
            if(point>=0 && point<=100){
                this.points.add(point);
                if(point>=50){
                    this.passingPoint.add(point);
                }
                this.gradeDistribution(point);
            }
            
        }
        public double pointAverage(){
            int sum=0;
            for(Integer i:this.points){
                sum= sum+ i;
            }
            if(sum==0){
                return 0;
            }
            return (1.0*sum)/this.points.size();
        }
        public double passingPointAverage(){
            int sum=0;
            for(Integer i:this.passingPoint){
                sum= sum+ i;
            }
            if(sum==0){
                return 0;
            }
            return (1.0*sum)/this.passingPoint.size();
        }
        public double passingPercentage(){
            return 100.0*this.passingPoint.size()/this.points.size();
        }
        public void gradeDistribution(int point){
            
            int grade;
            if(point<50){
                grade=0;
            }
            else if(point<60){
                grade=1;
            }
            else if(point<70){
                grade=2;
            }
            else if(point<80){
                grade=3;
            }
            else if(point<90){
                grade=4;
            }
            else{
                grade= 5;
            }
            this.grades.add(grade);
        }
        public String gradeStar(int grade){
            String result = grade +": ";
            for(Integer i:this.grades){
                if(i==grade){
                    result = result+"*"; 
                }
            }
            return result;
        }
        public void printStars(){
            System.out.println("Point average (all): "+this.pointAverage());
            if(this.passingPointAverage()==0){
                System.out.println("Point average (passing): "+this.passingPointAverage());
            }else{
                System.out.println("Point average (passing): "+this.passingPointAverage());
            }
            System.out.println("Pass percentage: " + this.passingPercentage());

        }
        public void printGradeDistribution(){
            int allGrade[]= {5,4,3,2,1,0};
            for(Integer g:allGrade)
            System.out.println(gradeStar(g));
        }

}