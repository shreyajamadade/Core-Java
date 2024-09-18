package Loops;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /* int num=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }


        int num=sc.nextInt();
        for(int i=1;i<=5;i++) {
            if(num>=10 && num<=20){
                System.out.println("Small");
                break;
            }
            else if(num>=21 && num<=33) {
                System.out.println("you win");
                break;
            }
            else if(num>=34 && num<=100){
                System.out.println("large");
                break;
            }
            else {
                System.out.println("Invalid Input");
                continue;
            }
        }

        */

        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i>=5);
    }
}
