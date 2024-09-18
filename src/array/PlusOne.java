package array;
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=in.nextInt();

        int digits[]=new int[n];
        for(int i=0;i<n;i++) {
            digits[i]=in.nextInt();
        }

        n=digits.length;
        for(int i=n-1;i>=0;i--) {
            if(digits[i]<9) {
                digits[i]++;
                //System.out.println(digits);
                return;
            }
            digits[i]=0;
        }
        int newNumber[]=new int[n+1];
        newNumber[0]=1;
        //System.out.println(newNumber);
        return;
    }
}
