// Write a Java method to convert the first letter of each word in a string to uppercase.
//Test Case: capitalizeWords("hello world") -> "Hello World"
package strings;

public class UpperCase {
    public static void main(String[] args) {
        String input = "hello world";
        String result = "";

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String restOfWord = words[i].substring(1);
            result += firstLetter + restOfWord + " ";
        }

        System.out.println(result.trim());
    }
}
