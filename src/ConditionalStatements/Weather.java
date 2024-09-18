package ConditionalStatements;
import java.util.*;
public class Weather {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int temp=in.nextInt();

        if(temp<=10){
            System.out.println("skiing");
        }
        else if(temp>=10 && temp<=20) {
            System.out.println("hiking");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("cycling");
        }
        else if(temp>=30){
            System.out.println("swimming");
        }
        else {
            System.out.println("Enter valid input");
        }
    }
}
