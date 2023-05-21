package javaCodes.day3;

import java.util.*;

public class menuDrivenPattern {

    public static void printPyramid() {
        int sp = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
            sp = sp - 1;
        }
    }

    public static void printHalfPyramid() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumberPyramid() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 1; k < i + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void printDiamond() {
        int sp = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
            sp = sp - 1;
        }
        sp = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = i-1; k >= 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
            sp = sp + 1;
        }
    }

    public static void printFloydPattern() {
        int n = 1;
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(n + " ");
                n += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1. Pyramid Pattern  2. half Pyramid  3. Number Pyramid  4. Diamond Pattern   5.Floyd's pyramid");
        System.out.print("Enter you choice(1/2/3/4/5) : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printPyramid();
                break;
            case 2:
                printHalfPyramid();
                break;
            case 3:
                printNumberPyramid();
                break;
            case 4:
                printDiamond();
                break;

            case 5:
                printFloydPattern();
                break;

            default:
                System.out.println("Wrong input");

        }

        sc.close();

    }
}
