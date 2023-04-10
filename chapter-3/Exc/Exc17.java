// 

import java.util.Scanner;
public class Exc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int remaining_seconds = seconds % 3600;
        int minutes = remaining_seconds / 60;
        seconds = remaining_seconds % 60;

        System.out.println(hours + " hours(s) " + minutes + " minutes(s) " + seconds + " seconds(s)");

    }
}


