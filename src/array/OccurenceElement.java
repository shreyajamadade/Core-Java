package array;
import java.util.*;
public class OccurenceElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter array size:");
        int n=in.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements "+n);
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the element:");
        int ele=in.nextInt();
        int occ=0;

        for(int i=0;i<n;i++) {
            if(ele==arr[i])
            {
                occ++;
            }
        }
        System.out.println(occ);
    }
}
