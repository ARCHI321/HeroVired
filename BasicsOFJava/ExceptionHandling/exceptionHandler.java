package BasicsOFJava.ExceptionHandling;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class exceptionHandler {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        try{
            try{
                a = sc.nextInt();
                b = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println(e);
                System.exit(1);
            }
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }

}
