package strings;
import java.util.*;
public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] words={"the","quick","brown","fox","quick"};
        String word1="the";
        String word2="fox";

        int pos1=-1;
        int pos2=-1;
        int minDistance=Integer.MAX_VALUE;

        for(int i=0;i<words.length;i++) {
            if(words[i].equals(word1)){
                pos1=i;
            }
            else if(words[i].equals(word2)) {
                pos2=i;
            }

            if(pos1 !=-1 && pos2!=-1) {
                int distance=Math.abs(pos1-pos2);
                if(distance<minDistance) {
                    minDistance=distance;
                }
            }
        }

        if(minDistance==Integer.MAX_VALUE) {
            System.out.println("one or both words not found in the list");
        }
        else {
            System.out.println("Minimum distance between \""+word1+" \"and \"" +word2+ "\"is:"+minDistance);
        }
    }
}
