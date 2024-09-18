package ConditionalStatements;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();

        int sum=0;
        while(num>0) {
           int digit=num%10;
           sum=sum+digit;
           num=num/10;
        }
        System.out.println(sum);
    }
}
