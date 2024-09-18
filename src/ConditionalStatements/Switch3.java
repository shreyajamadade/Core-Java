package ConditionalStatements;

import java.util.*;
public class Switch3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=890;
        int oddEven=num%2;

        switch(oddEven){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
