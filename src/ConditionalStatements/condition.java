package ConditionalStatements;

import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks=");
        int a=sc.nextInt();

        if(a<=100 && a>=75) {
            System.out.println("A");
        }
        else if((a<75) && (a>=50)) {
            System.out.println("B");
        }
        else if((a<50) && (a>=35))
        {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
