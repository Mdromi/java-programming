// java chapter-2/ComputeArea.java

import java.util.Scanner;;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.1416;

        System.out.println("Area: " + area);
        
    }
}