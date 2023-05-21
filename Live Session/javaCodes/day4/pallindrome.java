package javaCodes.day4;

public class pallindrome {
    public static void main(String[] args) {
        String a = "madam";
        StringBuilder newStr = new StringBuilder(a);
        String reversed = newStr.reverse().toString();

        if(a.equals(reversed)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrone");
        }


    }
}
