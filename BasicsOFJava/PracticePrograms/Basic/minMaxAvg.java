package BasicsOFJava.PracticePrograms.Basic;

import java.util.Scanner;

public class minMaxAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();
        int min , max , avg;
        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if( num2>num1 && num2>num3){
            max = num2;
        }
        else
            max = num3;

        if(num1<num2 && num1<num3){
            min = num1;
        }
        else if( num2<num1 && num2<num3){
            min = num2;
        }
        else
            min = num3;

        avg = ((num1 + num2 + num3)  / 3);
        
        System.out.println("the min of the 3 numbers : " + min);
        System.out.println("the max of the 3 numbers : " + max);
        System.out.println("the avg of the 3 numbers : " + avg);
        
        sc.close();
    }
    
}
