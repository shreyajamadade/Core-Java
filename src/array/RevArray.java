package array;
import java.util.*;
public class RevArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter elements size: ");
        int size=in.nextInt();

        int arr[]=new int[size];
        int rev[]=new int[arr.length];

        System.out.println("Enter elements"+size);
        for(int i=0;i<size;i++) {
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            rev[i]=arr[arr.length-i-1];
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(rev[i]+ " ");
        }
    }
}
