package array;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }

        int smallest=arr[0];
        for(int i=1;i<n;i++) //use to hold element
        {
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        System.out.println(smallest);

    }
}
