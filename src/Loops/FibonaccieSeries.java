package Loops;

public class FibonaccieSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<=7;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
