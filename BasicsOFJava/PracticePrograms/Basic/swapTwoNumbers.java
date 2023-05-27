package BasicsOFJava.PracticePrograms.Basic;
import java.util.*;
public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Before swapping : " + num1 + " " + num2);
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping : " + num1 + " " + num2);
        

    }
}
