package ConditionalStatements;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=2024;
        year= sc.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
