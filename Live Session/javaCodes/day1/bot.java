package javaCodes.day1;
import java.util.*;
public class bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = sc.nextLine();
        // // sc.close();
        // System.out.println(name);
        // System.out.print("Enter your age : ");
        // int age = sc.nextInt();
        // if (age>=18){
        //     System.out.println("Eligible for vote");
        // }
        // else{
        //     System.out.println("Not eligible for vote");
        // }
        // // sc.close();
        // System.out.println(age);
        // System.out.print("Enter your phone : ");
        // long phone = sc.nextLong();
        // // sc.close();
        // System.out.println(phone);
        System.out.print("Who Created Java : ");
        String author = sc.nextLine();
        if (author.equalsIgnoreCase("James Gosling")){
            System.out.println("Correct answer");
        }
        else{
            System.out.println("Wrong answer");
        }

        sc.close();
    }
}
