package strings;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str="swiss";
        int[] count=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
