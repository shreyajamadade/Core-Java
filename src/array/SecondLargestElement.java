package array;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter array elements "+size);
        for(int i=0;i<size;i++) {
            arr[i]=in.nextInt();
        }

        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Second Largest:"+arr[1]);
    }
}
