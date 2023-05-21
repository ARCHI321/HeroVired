package javaCodes.day1;
import java.util.Scanner;
public class numbers{
public static void main(String args[]) throws Exception{
      int num1,num2;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number : ");
      num1 = sc.nextInt();
      System.out.print("Enter the second number : ");
      num2 = sc.nextInt();
      System.out.println(num1 +" " + num2);
      sc.close();
      System.out.println("Equal : " + (num1 == num2));
      System.out.println("Not Equal : " + (num1 != num2));
      System.out.println("num1 is greater than num2 : " + (num1 > num2));
      System.out.println("num1 is Less than num2 : " + (num1 < num2));
   }
  
}