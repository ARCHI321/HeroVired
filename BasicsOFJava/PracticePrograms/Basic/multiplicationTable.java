package BasicsOFJava.PracticePrograms.Basic;

import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int i = 0;
        for(i=0;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }

    }
}
