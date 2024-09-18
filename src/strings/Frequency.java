package strings;

public class Frequency {
    public static void main(String[] args) {
        String str="swiss";
        int freq[]=new int[str.length()];

        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            freq[c]++;
        }

        for(int i=0;i<freq.length;i++) {
            if(freq[i]>0) {
                System.out.println((char) i + ":" +freq[i]);
            }
        }
    }
}
