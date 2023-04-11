// java chapter-4/Exc/Exc3.java

package Exc;
import java.util.Scanner;
public class Exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();


        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = i; j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

