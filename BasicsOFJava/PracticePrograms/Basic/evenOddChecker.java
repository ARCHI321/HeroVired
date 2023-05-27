package BasicsOFJava.PracticePrograms.Basic;

import java.util.Scanner;

public class evenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equals("y")){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println("The Given Number " + num + " is A EVEN NUMBER");
            }
            else{
                System.out.println("The Given Number " + num + " is A ODD NUMBER");
            }
            sc.nextLine();
            System.out.print("Do you want to continue(y/n)? : ");
            choice = sc.nextLine();
        }
        sc.close();
        
        
        

    }
}
