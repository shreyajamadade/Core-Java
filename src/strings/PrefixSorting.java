package strings;
import java.util.*;
public class PrefixSorting {
    public static void main(String[] args) {
        String[] w={"apple","appetizer","applicaton","apps"};

        if(w.length==0){
            System.out.println("-1");
            return;
        }

        Arrays.sort(w);

        String f=w[0];
        String l=w[w.length-1];

        int i=0;
        while(i<f.length() && i<l.length() && f.charAt(i)==l.charAt(i)) {
            i++;
        }

        String cp=f.substring(0,i);

        if(cp.isEmpty()) {
            System.out.println("-1");
        }
        else {
            System.out.println(cp);
        }
    }
}
