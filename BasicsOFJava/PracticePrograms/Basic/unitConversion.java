package BasicsOFJava.PracticePrograms.Basic;

import java.util.*;

public class unitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        int choice = 0;
        int cm, m, km;
        do {

            System.out.println("1.CM to M");
            System.out.println("2.M to KM");
            System.out.println("3.KM to M");
            System.out.println("4.M to CM");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    cm = sc.nextInt();
                    m = cm / 100;
                    System.out.println(cm + "CM" + "=" + m + "M");
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    m = sc.nextInt();
                    km = m / 1000;
                    System.out.println(m + "M" + "=" + km + "KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    km = sc.nextInt();
                    m = km * 1000;
                    System.out.println(km + "KM" + "=" + m + "M");
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    m = sc.nextInt();
                    cm = m * 100;
                    System.out.println(m + "M" + "=" + cm + "CM");
                    break;
                default:
                    System.out.println("Wrong value entered");    
            }
            sc.nextLine();
            System.out.print("Do you want to continue(y/n)? : ");
            ans = sc.nextLine();
        } while (ans.equals("y"));

        sc.close();

    }
}
