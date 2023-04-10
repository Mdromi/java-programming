// java chapter-3/test.java

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean isDivissibleBy4 = year % 4 == 0;
        boolean isDivissibleBy100 = year % 100 == 0;
        boolean isDivissibleBy400 = year % 400 == 0;

        boolean isLeapYear = (isDivissibleBy4 && !isDivissibleBy100) || isDivissibleBy400;

        if(isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
