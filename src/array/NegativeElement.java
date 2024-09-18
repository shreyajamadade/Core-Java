package array;
import java.util.*;
public class NegativeElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] < 0) {
                System.out.println("Negative element=" + arr[i]);
            }
             else if(arr[i]>0){
                System.out.println("Positive element=" + arr[i]);
            }
            else {
                System.out.println("Number not valid");
            }
        }
    }

}
