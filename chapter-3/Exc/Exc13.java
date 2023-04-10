// java chapter-3/Exc/Exc13.java

import java.util.Scanner;


public class Exc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total call duration in minutes");
        int minutes = input.nextInt();

        if(minutes<=500) {
         System.out.println("Total Bill: 125");
         return;
        }

        double minues25bill = 0.0;
        double minues49bill = 0.0;

        double minues25 = minutes - 500.00;
        
        if(minues25>=500) minues25bill = 500 * .25;
        else minues25bill = minues25 * .25;

        minues25 = minues25 - 500;
        if(minues25 > 0.0) minues49bill = minues25 * .49;

        double totalBill = 125 + minues25bill + minues49bill;
        System.out.println("Total Bill: " + totalBill);
    }
}

