package javaCodes.day3;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int copy = n;
        int fact = 1;
        while(copy>0){
            fact = fact * copy;
            copy-=1;
        }

        System.out.println("Factorial of " + n + " is " + fact);

        sc.close();
    }
}
