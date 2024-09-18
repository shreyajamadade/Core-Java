package ConditionalStatements;

import java.util.*;
public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        /* if(a%2==0) {
            System.out.println("Even number");
        } */

        // If number is less than 10 or even number
        // if(a%2==0 && a>0 && a<=10)
       // if(a%2==0) {
        //    if(a>0 && a<=10) {
        //        System.out.println("even or small number");
        //    }
      //  }

     /*   if(a>0 && a!=0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }

      */
        int choice=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(choice==1) {
            System.out.println(a+b);
        }
        if(choice==2) {
            System.out.println(a-b);
        }
        if(choice==3) {
            System.out.println(a*b);
        }
        if(choice==4) {
            System.out.println(a/b);
        }
        if(choice==5) {
            System.out.println(a%b);
        }
        if(choice<1 || choice >5) {
            System.out.println("wrong");
        }


    }
}
