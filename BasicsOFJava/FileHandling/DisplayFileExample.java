package BasicsOFJava.FileHandling;

import java.io.File;

public class DisplayFileExample {
    public void printFileNames(File[] a, int i, int lvl) {
        if (i == a.length) {
            return;
        }

        if (a[i].isFile()) {
            System.out.println(a[i].getName());
        }

        printFileNames(a, i + 1, lvl);
    }

    public static void main(String[] args) {
        String path = "E:\\Documents";
        File fObj = new File(path);
        DisplayFileExample obj = new DisplayFileExample();
        if (fObj.exists() && fObj.isDirectory()) {
            File a[] = fObj.listFiles();

            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("Displaying Files from the directory : " + fObj);
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

            obj.printFileNames(a, 0, 0);
        }
    }

}
