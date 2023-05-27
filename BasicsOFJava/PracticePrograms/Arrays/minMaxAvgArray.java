package BasicsOFJava.PracticePrograms.Arrays;

public class minMaxAvgArray {
    public static void main(String[] args) {
        int [] arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int min=10000000,max=0,count=0,sum=0;
        double avg = 0.0;

        for(int a: arrNum){
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
            sum = sum + a;
            count++;

        }
        avg = sum/count;
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
        System.out.println("The count is "+count);
        System.out.println("The average is "+avg);
    }
}
