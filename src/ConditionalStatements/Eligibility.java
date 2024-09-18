package ConditionalStatements;
import java.util.*;
public class Eligibility {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean qualifications=in.nextBoolean();
        int experience=in.nextInt();
        if(experience>=2 && qualifications==true){
            System.out.println("Applicant is eligible");
        }
        else {
            System.out.println("Applicant is not eligible.");
        }


    }
}
