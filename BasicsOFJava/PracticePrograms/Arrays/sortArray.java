package BasicsOFJava.PracticePrograms.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int [] arrNum = {23, 21, 44, 32, 12};
        System.out.println("Ascending order");
        for (int i = 0; i < arrNum.length; i++)   
        {  
            for (int j = i + 1; j < arrNum.length; j++)   
            {  
                int tmp = 0;  
                if (arrNum[i] > arrNum[j])   
                {  
                    tmp = arrNum[i];  
                    arrNum[i] = arrNum[j];  
                    arrNum[j] = tmp;  
                }     
            }  
            System.out.print(arrNum[i] + " ");  
        }
        
        System.out.println("\nDescending order");
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
          System.out.print(arrNum[i] + " ");  
       }  
}
}
