package ConditionalStatements;

import java.util.*;
public class ArmyDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int height=sc.nextInt();
        int weight=sc.nextInt();

        if(age>=18){
            if(height>=152){
                if(weight>=60 && weight<=100){
                    System.out.println("You are a fit");
                }
                else{
                    System.out.println("less weight");
                }
            }
            else{
                System.out.println("less height");
            }
        }
        else{
            System.out.println("Age is valid");
        }
    }
}
