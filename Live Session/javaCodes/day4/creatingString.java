package javaCodes.day4;

public class creatingString {
    public static void main(String[] args) {
        String s3 = "hello";
        String s4 = "hello";
        if (s3 == s4) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if (s1 == s2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        System.out.println(s1.length());
        System.out.println(s1 + " " + "World");


        String a = "A";
        String b = "b";
        System.out.println(a.compareTo(b));
    }

}
