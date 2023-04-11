package Exc;
// java chapter-4/Exc/Exc7.java

import java.util.Scanner;
public class Exc7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 1;

        while(value != 0) {
            System.out.println("Please enter a positive value (0 to exist): ");
            int palindromeNumber = input.nextInt();

            if(palindromeNumber == 0) return;

            String str = Integer.toString(palindromeNumber);
            String reverseStr = reverseString(str);

            if(str.equals(reverseStr)){
                System.out.println(str + " This is palindrome number.");
            } else {
                System.out.println(str + " This not a palindrome number.");
            }

        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            int j = sb.length() - i - 1;
            sb.setCharAt(i, (char) (sb.charAt(i) ^ sb.charAt(j)));
            sb.setCharAt(j, (char) (sb.charAt(i) ^ sb.charAt(j)));
            sb.setCharAt(i, (char) (sb.charAt(i) ^ sb.charAt(j)));
        }
        return sb.toString();
    }
}

