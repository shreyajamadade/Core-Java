package strings;

public class ReplaceOccurence {
    public static void main(String[] args) {
        String s="Hello";
        char old='l';
        char nw='p';

        String res="";

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==old) {
                res=res=res+nw;
            }
            else {
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
