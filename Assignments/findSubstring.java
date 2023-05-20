package Assignments;

import java.util.Scanner;

public class findSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();
        System.out.print("Enter the starting index value : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index value : ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Substring of " + word + " from " + start + " to " + end + " is "+word.substring(start, end));
        
        
        

    }
}
