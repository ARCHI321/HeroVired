package BasicsOFJava.PracticePrograms.Basic;
import java.util.*;

public class checkPrime {

    public static boolean isPrime(int n){
        for(int i=2;i<(int)n/2;i++){
            if(n%i == 0){
                return(false);
            }
        }
        return(true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isPrime(n) == true){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        
        sc.close();
        
        
        

    }
}
