package BasicsOFJava.LibraryManagementSystem;


import BasicsOFJava.LibraryManagementSystem.valueFromFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LibraryManagementSystemUsingFile {

    public static void viewAllBooks(HashMap<String, List<String>> bookList) {
        ArrayList<String> allBookIds = new ArrayList<String>(bookList.keySet());
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        System.out.println("List of all books");

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        
      
        for (String id : allBookIds) {
            System.out.print(id + "\t|");
            for(String value:bookList.get(id)){
                System.out.print(value + "\t|");

            }
            System.out.println();
            System.out.println(
                "----------------------------------------------------------------------------------------");
        }
        
    }

    public static void issueBooks(HashMap<String, List<String>> bookList) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> allBookIds = new ArrayList<String>(bookList.keySet());
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        System.out.println("Issue a book");

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        System.out.print("Enter the Book ID: ");
        String bookId = sc.nextLine();
        if (allBookIds.contains(bookId)) {
            ArrayList<String> bookValue = new ArrayList<>(bookList.get(bookId));
            System.out.println(bookId + " " + bookValue.get(0) + "-" + bookValue.get(1) + ":" + bookValue.get(2));
            if (bookValue.get(2).equals("Available")) {
                System.out.print("Enter StudentID: ");
                String studentId = sc.nextLine();
                System.out.print("Enter C to confirm: ");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("C")) {
                    bookValue.set(2, studentId);
                    bookValue.set(3, "01-05-2023");
                    bookList.put(bookId, bookValue);
                    valueFromFile.HashMapToTextFile(bookList);
                    System.out.println("Book ID " + bookId + " is issued to " + studentId);

                }
            } else {
                System.out.println("Book not available at the moment.");
            }
        } else {
            System.out.println("Not available");
        }

    }

    public static void bookReturn(HashMap<String, List<String>> bookList) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> allBookIds = new ArrayList<String>(bookList.keySet());
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        System.out.println("Return a book");

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        System.out.print("Enter the Book ID: ");
        String bookId = sc.nextLine();
        int noOfDaysLate = 0, noOfDays = 0;
        if (allBookIds.contains(bookId) && !(bookList.get(bookId).get(2).equals("Available"))) {
            ArrayList<String> bookValue = new ArrayList<>(bookList.get(bookId));
            System.out.println(bookId + "-" + bookValue.get(0) + " by " + bookValue.get(1));
            System.out.println("StudentID - " + bookValue.get(2));
            String issue_date = bookValue.get(3);
            System.out.println("Issue Date - " + issue_date);
            String current_date = java.time.LocalDate.now().toString();
            String currentDay = current_date.substring(current_date.lastIndexOf("-") + 1, current_date.length());
            String currentMonth = current_date.substring(current_date.lastIndexOf("-") - 2,
                    current_date.lastIndexOf("-"));
            String currentYear = current_date.substring(0, current_date.indexOf("-"));

            String newCurrentDate = currentDay + " " + currentMonth + " " + currentYear;
            // System.out.println(currentDay+currentMonth+currentYear);

            String issueDay = issue_date.substring(0, issue_date.indexOf("-"));
            String issueMonth = issue_date.substring(issue_date.lastIndexOf("-") - 2, issue_date.lastIndexOf("-"));
            String issueyear = issue_date.substring(issue_date.lastIndexOf("-") + 1, issue_date.length());
            // System.out.println(issueDay+issueMonth+issueyear);
            String newIssueDate = issueDay + " " + issueMonth + " " + issueyear;

            SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");

            Date date1 = (Date) myFormat.parse(newIssueDate);
            Date date2 = (Date) myFormat.parse(newCurrentDate);
            long diff = date2.getTime() - date1.getTime();
            noOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println("Number of days from issue : " + noOfDays);
            if (noOfDays > 7) {
                noOfDaysLate = noOfDays - 7;
                System.out.println("Delayed by - " + noOfDaysLate);
                System.out.println("Delayed Charges - Rs " + noOfDaysLate * 10 + ".00");
                System.out.print("Enter R to confirm the return: ");
                String returnValue = sc.nextLine();
                if (returnValue.equalsIgnoreCase("r")) {
                    System.out.println("BookID: " + bookId + " is returned back");
                }
                bookValue.set(2, "Available");
                bookValue.set(3, "null");
                bookList.put(bookId, bookValue);
                valueFromFile.HashMapToTextFile(bookList);


            }
            else{
                System.out.print("Enter R to confirm the return: ");
                String returnValue = sc.nextLine();
                if (returnValue.equalsIgnoreCase("r")) {
                    System.out.println("BookID: " + bookId + " is returned back");
                }
                bookValue.set(2, "Available");
                bookValue.set(3, "null");
                bookList.put(bookId, bookValue);
                valueFromFile.HashMapToTextFile(bookList);
            }

        } else {
            System.out.println("Book has not been issued or the book does nto exist in record");
        }

    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String ans;
        HashMap<String, List<String>> bookList = valueFromFile.HashMapFromTextFile();
        System.out.println(bookList);

        do {
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------");

            System.out.println("Welcome to the Unique Library");

            System.out.println(
                    "-----------------------------------------------------------------------------------------------------");
            System.out.println("1. View the complete list of Books");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");

            System.out.print("Please choose an option from the above menu: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewAllBooks(bookList);
                    break;
                case 2:
                    issueBooks(bookList);
                    break;
                case 3:
                    bookReturn(bookList);
                    break;
                case 4:
                    System.out.println("Thank you for visiting  SmartPoint!");
                    System.exit(1);
                default:
                    System.out.println("Wrong input entered");

            }
            sc.nextLine();
            System.out.print("Do you want to continue(y/n) : ");
            ans = sc.nextLine();
        } while (ans.equals("y"));

    }
}
