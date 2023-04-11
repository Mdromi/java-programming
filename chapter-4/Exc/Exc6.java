package Exc;
// java chapter-4/Exc/Exc6.java

import java.util.Scanner;
public class Exc6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Products you Buy?");
        int productQuantity = input.nextInt();

        double totalPrice = 0.0;
        double priceWithTax = 0.0;
        double price = 0.0;
        double payMoney = 0.0;

        while(productQuantity <= 0){
            System.out.println("Please Buy minimum 1 product");
            productQuantity = input.nextInt();
        }

        for(int i = 0; i < productQuantity; i++){
            System.out.println("Enter The Price One Buy One: ");
            price = input.nextDouble();
            totalPrice += price;
        }

        priceWithTax = (totalPrice * 0.15) + totalPrice;
        System.out.println("Total Price: " + priceWithTax);

        System.out.println("Please Pay Money: ");
        payMoney = input.nextDouble();

        while(payMoney != priceWithTax) {
            if(payMoney < priceWithTax) {
                System.out.println("you have to Pay More " + (priceWithTax - payMoney));
                payMoney += input.nextDouble();
            }
            if(payMoney > priceWithTax) {
                System.out.println("your return money " + (payMoney - priceWithTax));
                break;
            }
        }

        System.out.println("Thanks. next time again come here..");
    }
}

