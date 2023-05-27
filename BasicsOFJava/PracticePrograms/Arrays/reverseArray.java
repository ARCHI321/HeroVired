package BasicsOFJava.PracticePrograms.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        for(int i=arrNum.length-1;i>=0;i--){
            System.out.print(arrNum[i] + " ");
        }
    }
}
