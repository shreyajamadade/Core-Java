package strings;

public class palindrome2 {
    public static void main(String[] args) {
        String name="madam";
        int n=name.length();

        int j=n-1;
        boolean flag=true;

        for(int i=0;i<n/2;i++) {
            if(name.charAt(i)!=name.charAt(j)) {
                flag=false;
                break;
            }
            j--;

        }
        if(flag==true) {
            System.out.println(name+" palindrome");
        } else {
            System.out.println(name + " not palindrome");
        }

    }
}
