package strings;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        String x="siLent";
        String y="Listen";

        x=x.replace(" "," ");
        y=y.replace(" "," ");
        x=x.toUpperCase();
        y=y.toUpperCase();
        System.out.println(x);
        System.out.println(y);

        char a[]=x.toCharArray();
        char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result=Arrays.equals(a,b);
        if(result==true) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
