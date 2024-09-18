package ConditionalStatements;
import java.util.*;
public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double basePrice=in.nextDouble();
        String category=in.next().toLowerCase();
        boolean eligibleForDiscount=in.nextBoolean();

        double finalPrice=basePrice;

        if(category.equals("electronics")) {
            if(eligibleForDiscount) {
                finalPrice=basePrice*0.90;
            }
        }

        else if(category.equals("clothing")) {
            if(eligibleForDiscount) {
                finalPrice=basePrice*0.80;
            }
        }

        else if(category.equals("grocery")) {

        }

        else {
            System.out.println("Invalid Product category");
        }

        System.out.println(finalPrice);
    }
}
