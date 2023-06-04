package BasicsOFJava.FileHandling;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import BasicsOFJava.FileHandling.DisplayFileExample;

public class menuDrivenFileHandler {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create a new folder");
        System.out.println("2. Create a new text file");
        System.out.println("3. Write into a text file");
        System.out.println("4. Rename a file");
        System.out.println("5. Delete a File");
        System.out.print("Please enter the Menu: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                String filepath = "E:/Hero Vired/BasicsOFJava/FileHandling/";
                sc.nextLine();
                System.out.print("Enter the name of the desired a directory: ");
                filepath = filepath + sc.nextLine();
                File f1 = new File(filepath);
                boolean bool = f1.mkdir();
                if (bool) {
                    System.out.println("Folder is created successfully");
                } else {
                    System.out.println("Error Found!");
                }
                break;
            case 2:
                sc.nextLine();
                System.out.print("Enter the text file name : ");
                String name = sc.nextLine();
                File myObj = new File("E:/Hero Vired/BasicsOFJava/FileHandling/Hello/" + name + ".txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
                break;
            case 3:
                sc.nextLine();
                String path = "E:/Hero Vired/BasicsOFJava/FileHandling/Hello";
                File fObj = new File(path);
                DisplayFileExample obj = new DisplayFileExample();
                if (fObj.exists() && fObj.isDirectory()) {
                    File a[] = fObj.listFiles();
                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
                System.out.println("Displaying Files from the directory : " + fObj);
                System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

                obj.printFileNames(a, 0, 0);
                }
                System.out.print("Enter the which text file you want to write in : ");
                name = sc.nextLine();
                FileWriter myWriter = new FileWriter("E:/Hero Vired/BasicsOFJava/FileHandling/Hello/" + name + ".txt");
                myWriter.write("Welcome to " + name + "file");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                break;
            case 4:
                sc.nextLine();
                String path1 = "E:/Hero Vired/BasicsOFJava/FileHandling/Hello";
                File fObj1 = new File(path1);
                DisplayFileExample obj1 = new DisplayFileExample();
                if (fObj1.exists() && fObj1.isDirectory()) {
                    File a[] = fObj1.listFiles();
                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
                System.out.println("Displaying Files from the directory : " + fObj1);
                System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

                obj1.printFileNames(a, 0, 0);
                }
                System.out.print("Enter the which text file you want to rename : ");
                String filename = sc.nextLine();
                File filenamePath = new File(path1 + "/" + filename + ".txt");
                System.out.print("Enter the new name of the file : ");
                String renameFileName = sc.nextLine();
                File renameFilenamePath = new File(path1 + "/" + renameFileName + ".txt");
                boolean flag = filenamePath.renameTo(renameFilenamePath);
                if (flag == true) {
                    System.out.println("File Successfully Rename");
                }

                else {
                    System.out.println("Operation Failed");
                }
                break;
            case 5:
                sc.nextLine();
                String path2 = "E:/Hero Vired/BasicsOFJava/FileHandling/Hello";
                File fObj2 = new File(path2);
                DisplayFileExample obj2 = new DisplayFileExample();
                if (fObj2.exists() && fObj2.isDirectory()) {
                    File a[] = fObj2.listFiles();
                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
                    System.out.println("Displaying Files from the directory : " + fObj2);
                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

                    obj2.printFileNames(a, 0, 0);
                }
                System.out.print("Enter the which text file you want to delete : ");
                String f = sc.nextLine();
                File file = new File(path2 + "/" + f + ".txt");

                if (file.delete()) {
                    System.out.println("File deleted successfully");
                } else {
                    System.out.println("Failed to delete the file");
                }
                break;
                
                    
            default:
                System.out.println("Wrong input");

        }
    }
}
