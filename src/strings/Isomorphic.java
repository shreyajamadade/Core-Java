package strings;

public class Isomorphic {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxyt";

        // Variable to check if strings are isomorphic
        boolean isIsomorphic = true;

        // Check if lengths of the strings are different
        if (str1.length() != str2.length()) {
            isIsomorphic = false;
        } else {
            // Arrays to track mappings
            int[] map1 = new int[256]; // Mapping from str1 to str2
            int[] map2 = new int[256]; // Mapping from str2 to str1

            // Traverse through both strings
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);

                // Check if the current character in str1 has been mapped before
                if (map1[c1] != 0 && map1[c1] != c2) {
                    isIsomorphic = false;
                    break;
                }

                // Check if the current character in str2 has been mapped before
                if (map2[c2] != 0 && map2[c2] != c1) {
                    isIsomorphic = false;
                    break;
                }

                // Set the current mappings
                map1[c1] = c2;
                map2[c2] = c1;
            }
        }

        // Output the result
        System.out.println("Are the strings isomorphic? " + isIsomorphic);
    }
}
