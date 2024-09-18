package Basic;

import java.util.*;
public class logical {
    public static void main(String[] args) {
        //int a=5,b=3,c=4;
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        //Logical &&
        System.out.println(a>b && a>c);
        System.out.println(b>a && b>c);
        System.out.println(c>a && c>b);

        //Logical ||
        System.out.println(a>b || a>c);
        System.out.println(b>a || b>c);
        System.out.println(c>a || c>b);

        //Logical !
        System.out.println(a>b != a>c);
        System.out.println(b>a != b>c);
        System.out.println(c>a != c>b);


    }
}
