// java chapter-4/GuessingGame.java

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 15;
        int guess;
        do{
            System.out.println("Guess a number: ");
            guess = input.nextInt();

            if(guess == number){
                System.out.println("Congratulations! you guessed the number.");
            } else if(number > guess){
                System.out.println("The number grater than " + guess);
            } else {
                System.out.println("The number less than " + guess);
            }

        } while( guess != number);
    }
}

