package BasicsOFJava.PracticePrograms.Basic;
import java.util.*;
public class gpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        int percentage = sc.nextInt();
        sc.close();
        String grade;
        double gpa;
        if(percentage >=90 && percentage <= 100){
            grade = "A";
            gpa = 4.0;
        }
        else if(percentage >=80 && percentage <= 89){
            grade = "B";
            gpa = 3.0;
        }
        else if(percentage >=70 && percentage <= 79){
            grade = "C";
            gpa = 2.0;
        }
        else if(percentage >=60 && percentage <= 69){
            grade = "D";
            gpa = 1.0;
        }
        else{
            grade = "F";
            gpa = 0.0;
        }

        System.out.println("Your Grade is : " + grade);
        System.out.println("Your GPA is : " + gpa);


    }
    
}
