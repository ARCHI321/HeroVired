package javaCodes.day3;

public class firstNNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Printing the first 10 even Numbers ");
        for(int i =1;i<=100;i++){
            if(i%2 == 0){
                System.out.print(i +" ");
                count++;
                if(count == 10){
                    break;
                }
            }
        }
    }
}
