package javaCodes.day4;

public class stringBuilder {
    public static void main(String[] args) {
        String str = "Hello my name is Archisman banik";
        System.out.println(str);
        StringBuilder reversed = new StringBuilder(str);
        System.out.println(reversed.reverse());

        String output = reversed.toString();
        System.out.println(output);

        
    }
}
