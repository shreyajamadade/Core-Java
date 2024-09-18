package strings;

public class ReversedWords {
    public static void main(String[] args) {
        String s="I love programming very much";
        String[] words=s.trim().split("\\s+");
        String res="";

        for(int i=words.length-1;i>=0;i--) {
            res=res+words[i];

            if(i!=0){
                res=res+" ";
            }
        }
        System.out.println(res);
    }
}
