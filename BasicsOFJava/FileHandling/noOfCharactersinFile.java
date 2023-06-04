package BasicsOFJava.FileHandling;

import BasicsOFJava.FileHandling.DisplayFileExample;
import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class noOfCharactersinFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        String filename = sc.nextLine();
        BufferedReader reader = null;


        int charCount = 0;

        int wordCount = 0;

        int lineCount = 0;
        String newPath = path + "/" + filename + ".txt";
        try {

            reader = new BufferedReader(new FileReader(newPath));

            String currentLine = reader.readLine();

            while (currentLine != null) {

                lineCount++;

                String[] words = currentLine.split(" ");

                wordCount = wordCount + words.length;

                for (String word : words) {

                    charCount = charCount + word.length();
                }

                currentLine = reader.readLine();
            }

            System.out.println("Number Of Chars In A File : " + charCount);

            System.out.println("Number Of Words In A File : " + wordCount);

            System.out.println("Number Of Lines In A File : " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
