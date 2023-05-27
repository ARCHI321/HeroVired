package BasicsOFJava.PracticePrograms.Arrays;

public class largestPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<(int)n/2;i++){
            if(n%i == 0){
                return(false);
            }
        }
        return(true);
    }
    public static void main(String[] args) {
        int []arrNum = {2, 29, 51, 8, 4};
        for (int i = 0; i < arrNum.length; i++)   
       {  
         for (int j = i + 1; j < arrNum.length; j++)   
         {  
            int tmp = 0;  
            if (arrNum[i] < arrNum[j])   
            {  
                tmp = arrNum[i];  
                arrNum[i] = arrNum[j];  
                arrNum[j] = tmp;  
           }  
         }  
       }  
       for (int i = 0; i <=arrNum.length - 1; i++)   
      {  
          if(isPrime(arrNum[i])){
               System.out.println("Largest Prime number is : " + arrNum[i]);
               break;
          }
          else{
            continue;
          }
       }  

    }
}
