package ConditionalStatements;
import java.util.*;
public class Grades {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int score=in.nextInt();

        if(score<=100 && score>=90) {
            System.out.println("Grade A");
        }
        else if(score<=89 && score>=80) {
            System.out.println("Grade B");
        }
        else if(score<=79 && score>=70) {
            System.out.println("Grade C");
        }
        else if(score<=69 && score>=60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
