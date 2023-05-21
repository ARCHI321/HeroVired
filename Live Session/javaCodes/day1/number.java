package javaCodes.day1;
import java.util.Scanner;
public class number {
    public static void main(String args[]) throws Exception{
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        System.out.println(num);
        sc.close();
        num += 2;
        System.out.println("After addition : " + num );
        num -=4;
        System.out.println("After subtraction : " + num );
        num *=7;
        System.out.println("After multiplication : " + num );
        System.out.println("After subtraction : " + num );
        num /=4;
        System.out.println("After division : " + num );
        num %=12;
        System.out.println("After modulus : " + num );

    }
}
