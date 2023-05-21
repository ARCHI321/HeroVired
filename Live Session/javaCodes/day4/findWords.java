package javaCodes.day4;

public class findWords {
    public static void main(String[] args) {
        String sentence = "Hello my name is Archisman Banik";
        // String sen[] = sentence.split(" ");
        // for(int i=0;i<sen.length;i++){
        //     System.out.println(sen[i]);
        // }
        // System.out.println(sen.length);

        // int count = 1;
        // for(int i=0;i<sentence.length();i++){
        //     char q = sentence.charAt(i);
        //     if(q==32){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        for(int i=sentence.length()-1;i>0;i--){
            System.out.print(sentence.charAt(i));
        }
    }
}
