package ConditionalStatements;
import java.util.*;

public class OverdueLibraryBooks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double fine=0;

        int days=in.nextInt();

        if(days<=7) {
            fine=0;

        }
        else if(days>=8 && days<=30) {
            fine=(days-7)*1.00;

        }
        else{
            fine=(23*1.00)+((days-30)*2.00);

        }
        System.out.println(fine);
    }
}
