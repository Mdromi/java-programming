// java chapter-5/ArrayExample3.java

import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            System.out.println(i + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Index\tValue");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + "\t" + numbers[i]);
        }
    }
}

