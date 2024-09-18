package array;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        /*
        int arr[]={10,11,23,34,45}; //static memory allocation
        System.out.println(arr[2]);
        System.out.println(arr.length);

        int x[]=new int[5]; //dynamic memory allocation
        x[0]=1;
        x[1]=4;
        x[2]=6;
        x[3]=8;
        x[4]=10;
         */

        Scanner sc=new Scanner(System.in);

        //create
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        //read
        int sum=0;
        for(int i=0;i<5;i++){
            if(arr[i]%2==0) {
                System.out.println("Even element= "+arr[i]);
            }
            sum+=arr[i];
        }
        System.out.println("Sum="+sum);
    }
}
