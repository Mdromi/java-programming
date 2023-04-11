// java chapter-3/test.java

import java.util.Scanner;

public class ShoppingDecisionMaker {
    static final boolean DISCOUNT_AVAILABLE = true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        int price = input.nextInt();

        if(isAffordable(price)){
            buyProduct();
        } else if(isLittleExpensive(price)){
            if(isDiscountAvailable()){
                buyProduct();
            } else {
                addThisProductWishList();
            }
        } else {
            dontBuyThisProduct();
        }
    }

    private static void dontBuyThisProduct() {
        System.out.println("I will not buy this product");
    }

    private static void addThisProductWishList() {
        System.out.println("I will buy it later.");
    }

    private static boolean isDiscountAvailable() {
        return DISCOUNT_AVAILABLE;
    }

    private static boolean isLittleExpensive(int price) {
        if(500 < price && price < 1000){
            return true;
        } else {
            return false;
        }
    }

    private static void buyProduct() {
        System.out.println("I will buy it.");
    }

    private static boolean isAffordable(int price) {
        if(500 <= price){
            return true;
        } else {
            return false;
        }
    }
}

