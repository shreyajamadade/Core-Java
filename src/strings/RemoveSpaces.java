package strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input="Hello World";
        String result=" ";
        for(int i=0;i<input.length();i++) {
            if(input.charAt(i)!=' ') {
                result=result+input.charAt(i);
            }
        }
        System.out.println(result);
    }
}
