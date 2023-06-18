package BasicsOFJava.Oops.Practise;

class hello {
    private static int count = 0;

    hello() {
        count++;
    }

    public static int getCount() {
        return (count);
    }
}

public class countObj {
    public static void main(String[] args) {
        hello obj = new hello();
        hello obj1 = new hello();
        hello obj2 = new hello();
        System.out.println("Number of objects created till now : " + obj2.getCount());

    }
}
