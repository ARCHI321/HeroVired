package BasicsOFJava.PracticePrograms.Arrays;


public class moveAllOnes {
    public static void main(String[] args) {
        int []arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int []newArr = new int[arrNum.length*2];
        int []oneArr = new int[arrNum.length];
        int index1 = 0,index2 = 0,c=0;
        for(int i:arrNum){
            if(i!=1){
                newArr[index1] = i;
                index1++;
            }
            else{
                oneArr[index2] = i;
                index2++;
            }
        }
        for(int i:oneArr){
            newArr[index1+c] = i;
            c++;
        }
        
        for(int i:newArr){
            if(i!=0)
            System.out.print(i + " ");
        }
        
    }
}
