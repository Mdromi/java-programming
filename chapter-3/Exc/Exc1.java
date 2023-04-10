// java chapter-3/Exc/Exc1.java

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int first = input.nextInt();
        System.out.println("Enter 2nd value");
        int second = input.nextInt();
        System.out.println("Enter 3rd value");
        int third = input.nextInt();
        System.out.println("Enter 4th value");
        int forth = input.nextInt();
        System.out.println("Enter 5th value");
        int fifth = input.nextInt();

        // 1st exercise solved 
        boolean allEqual = (first == second) && (third == forth) && (first == fifth);
        if (allEqual) {
            System.out.println("All Number are equal!..");
        }

        // 2nd exercise solved 
        double average = (first + second + third + forth + fifth) / 5;
        System.out.println("Five Number are average: " + average);
    }
}
