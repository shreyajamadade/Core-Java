package ConditionalStatements;
import java.util.*;
public class TotalBills {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int qtyStarter=in.nextInt();
        int qtyMainCourse=in.nextInt();
        int qtyDessert=in.nextInt();
        int qtyDrinks=in.nextInt();

        double priceStarter=5.00;
        double priceMainCourse=10.00;
        double priceDessert=4.50;
        double priceDrinks=2.50;

        double totalStarter=qtyStarter*priceStarter;
        double totalMainCourse=qtyMainCourse*priceMainCourse;
        double totalDessert=qtyDessert*priceDessert;
        double totalDrinks=qtyDrinks*priceDrinks;

        double totalBill=totalStarter+totalMainCourse+totalDessert+totalDrinks;

        if(qtyMainCourse>0 && qtyDessert>0) {
            totalBill=totalBill-(qtyDessert*priceDessert*0.20);
        }

        if(totalBill>50) {
            totalBill=totalBill-(totalBill*0.10);
        }
        else if(totalBill>30) {
            totalBill=totalBill-(totalBill*0.05);
        }

        System.out.println(totalBill);
    }
}
