package array;
import java.util.*;
public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,2,4,1,6,7,5,3,8};
        int n=arr.length;

        System.out.println("Enter element which can be sum of element:");
        int sum=sc.nextInt();

            int i=0;
            int j=n-1;

            Arrays.sort(arr);
            while(j>i) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                    i++;
                    j--;
                } else if (arr[i] + arr[j] < sum) {
                    i++;
                } else {
                    j--;
                }
            }
    }
}
