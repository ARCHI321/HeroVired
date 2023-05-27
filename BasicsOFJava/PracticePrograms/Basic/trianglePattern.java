package BasicsOFJava.PracticePrograms.Basic;

public class trianglePattern {
    public static void main(String[] args)  {
        int sp1 = 5;
        int sp2 = 4;
        for (int i = 0; i < 3; i++) {
           for (int k = 0; k < sp1; k++) {
                  System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            sp1 = sp1 - 1;
        }
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < sp2; k++) {
                   System.out.print(" ");
             }
             for (int j = 2; j > i; j--) {
                 System.out.print("* ");
             }
             System.out.println();
             sp2 = sp2 + 1;
         }

        
        
    }
}
