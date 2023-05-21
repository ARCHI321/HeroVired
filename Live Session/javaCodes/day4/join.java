package javaCodes.day4;

public class join {
    public static void main(String[] args) 
    {
        String s2 = "Shakul,Mallik,HeroVired";
        String[] s3 = s2.split(",");
        for(int i=0;i<s3.length;i++){
            System.out.println(s3[i]);
        }

    }
}
