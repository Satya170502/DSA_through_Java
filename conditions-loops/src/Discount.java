import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        float price = 1;
        int discount_amount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price of the product");
        price = in.nextFloat();
        System.out.println("Enter discount amount");
        discount_amount = in.nextInt();
        float total_discount = (price / 100) * discount_amount;
        float discounted_price = price - total_discount;
        System.out.println("Total price of the discounted product is " + discounted_price);
        in.close();
    }
}
