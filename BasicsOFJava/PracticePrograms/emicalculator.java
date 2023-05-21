package BasicsOFJava.PracticePrograms;

import java.util.*;

public class emicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loan amount : ");
        double principal = sc.nextDouble();
        System.out.print("1. Amortized loan payment 2.Interest only Loan ");
        System.out.println();
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        double rate[] = {10,15};
        switch(choice){
            case 1:
               System.out.println("Your interst rate is : " + rate[0]);
               System.out.print("Enter the total number of payment periods : ");
               double loanTime = sc.nextDouble();
               System.out.print("Calculated Interest : ");
               double emi = principal / ((Math.pow((1+rate[0]) , loanTime) - 1) / (rate[0] * Math.pow((1+rate[0]), loanTime)));
               System.out.printf("Emi that has to be paid : %.2f" + emi);
               break;

           case 2:
               System.out.println("Your interst rate is : " + rate[1]);
               System.out.print("Enter number of payments per year : ");
               double n = sc.nextDouble();
               double emiInterestonly = principal * (rate[1] / n);
               System.out.println("Emi Interest only that has to be paid : " + emiInterestonly);
               break;
            
           default:
               System.out.println("Wrong input entered");



        }

        sc.close();
        
        
        
        
        

    }
}

// Steps:
// 1. take the Principal amount , Interest rate , tenure , down payment
// 2. Formula:
// E = (P.r.(1+r)^n) / ((1+r)^n – 1)
// Here,
// P = loan amount i.e principal amount
// R = Interest rate per month
// n = Loan time period in year
