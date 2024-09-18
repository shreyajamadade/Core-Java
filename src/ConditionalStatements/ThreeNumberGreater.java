package ConditionalStatements;

import java.util.*;
public class ThreeNumberGreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 numbers=");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3=sc.nextInt();

        if(num1>=num2 && num1>=num3)
        {
            System.out.println("Num1 is greater");
        }
        else if (num2>=num1 && num2>=num3)
        {
            System.out.println("Num2 is grater");
        }
        else
        {
            System.out.println("Num3 is greater");
        }
    }
}
