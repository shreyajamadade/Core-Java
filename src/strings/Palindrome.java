package strings;

public class Palindrome {
    public static void main(String[] args) {
        String name="madam";
        String rev = "";

        // int length = str.length();
/*
        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + name.charAt(i);

        if (name.equals(rev))
            System.out.println(name+" is a palindrome");
        else
            System.out.println(name+" is not a palindrome");

 */

        for(int i=0;i<name.length();i++) {
            rev=name.charAt(i)+rev;
        }

        if (name.equals(rev))
            System.out.println(name+" is a palindrome");
        else
            System.out.println(name+" is not a palindrome");

    }
}
