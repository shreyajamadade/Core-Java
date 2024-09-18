package strings;
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++) {
            dp[i][i]=1;
        }

        for(int length=2;length<=n;length++) {
            for(int i=0;i<=n-length;i++) {
                int j=i+length-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    dp[i][j]=dp[i+1][j-1]+2;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }

        int lpsLength=dp[0][n-1];
        int minDeletions=n-lpsLength;
        System.out.println("Minimum deletions to make the string a palindrome:"+minDeletions);
    }
}
