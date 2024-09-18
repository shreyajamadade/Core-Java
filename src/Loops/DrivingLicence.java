package Loops;
import java.util.*;
public class DrivingLicence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age;
        boolean licence;
        age=in.nextInt();
        licence=in.nextBoolean();
        if(age>=18 && licence) {
            System.out.println("You are eligible to drive.");
        }
        else if(age>=18 && !licence) {
            System.out.println("You are not elible to drive without a valid driving licence.");
        }
        else {
            System.out.println("You are not eligible to drive.");
        }
    }

}
