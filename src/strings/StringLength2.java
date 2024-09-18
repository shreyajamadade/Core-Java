package strings;

public class StringLength2 {
    public static void main(String[] args) {
        String name="shreya";
        int i=0;
        while(name.charAt(i)!='\0') {
            i++;
        }
        System.out.println(i);
    }
}
