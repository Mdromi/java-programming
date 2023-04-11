// java chapter-4/WeekdaysAndWeekends.java

import java.util.Scanner;

public class WeekdaysAndWeekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day betwwn (1 to 7)");
        int day = input.nextInt();

        // String result = switch(day) {
        //     case 1, 2, 3, 4, 5 -> "Weekdays";
        //     case 6, 7 -> "Weekends";
        //     default -> "Unexpected value: " + day;
        // }

        // System.out.println("result = " + result);
    }
}
