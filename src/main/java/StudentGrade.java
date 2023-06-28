import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the Student Name : ");
            String name = scanner.next();

            System.out.print("Math Score :");
            double mathScore = scanner.nextDouble();

            System.out.print("English Score : ");
            double engScore = scanner.nextDouble();

            System.out.println("Grade on Each subjects as follow for " + name);

            System.out.println("Maths Grade : " + gradeCalculator(mathScore));
            System.out.println("English Grade :" + gradeCalculator(engScore));

            System.out.print("Do you want to verify for more student (Y/N) : ");

        } while(scanner.next().equalsIgnoreCase("Y"));
    }

    private static String gradeCalculator(double score) {
        String grade="No Grade";
        if(score>=60 && score<70){
            grade="C";
        }else if(score>=70 && score<80){
            grade="B";
        }else if(score>=80){
            grade="A";
        }
        return grade;
    }

}
