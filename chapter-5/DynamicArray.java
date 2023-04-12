// java chapter-5/DynamicArray.java

import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of integers: ");
        int sizeOfArray = input.nextInt();

        int capacity = 10;
        int size = 0;
        int[] elements = new int[capacity];

        int nextInt;

        while(true){
            nextInt = input.nextInt();
            // break if input is -1
            if(nextInt == -1){
                System.out.println("We are done taking inputs!");
                break;
            }

            // grow if array exceed initial capacity
            if(elements.length == size){
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements, newCapacity);
            }

            elements[size] = nextInt;
            size++;
        }

        // shrink if array is not fully occupied
        if(elements.length > size){
            elements = Arrays.copyOfRange(elements, 0, size);
        }

        System.out.println("You entered: ");
        System.out.println(Arrays.toString(elements));
    }
}
