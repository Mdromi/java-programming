// java chapter-5/AverageMinAndMaxCalculator.java

import java.util.Scanner;
public class AverageMinAndMaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            System.out.println(i + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        sum = 0;
        for(int number: numbers){
            sum += number;
        }

        double average = (double) sum / numbers.length;

        int min = numbers[0];
        int max = numbers[0];


        for(int i = 1; i < numbers.length; i++){
            if(min > numbers[i]) min = numbers[i];
            if(max < numbers[i]) max = numbers[i];
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

