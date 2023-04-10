// java chapter-3/Exc/Exc3.java

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight(in kilogram)");
        int weight = input.nextInt();
        System.out.println("Enter height(in meter)");
        int height = input.nextInt();

        double BMI = weight / (height * height);
        System.out.println("BMI: " + BMI);
    }
}

