// java chapter-4/PiCalculatorDemo.java

public class PiCalculatorDemo {
    private static double calculate(int nTerms) {
        double numerator = 4.0;
        double denominator = 1.0;
        double sign = 1.0;

        double pi = 0.0;
        for(int i = 0; i < nTerms; i++){
            pi += sign * (numerator/ denominator);
            denominator += 2.0;
            sign *= -1.0;
        }
        return pi;
    }

    public static void main(String[] args) {
        double pi = calculate(100_000);
        System.out.println("pi = " + pi);
    }

    
}

// public class PiCalculator{
//     public double calculate(int nTerms) {
//         double numerator = 4.0;
//         double denominator = 1.0;
//         double sign = 1.0;

//         double pi = 0.0;
//         for(int i = 0; i < nTerms; i++){
//             pi += sign * (numerator/ denominator);
//             denominator += 2.0;
//             sign *= -1.0;
//         }
//         return pi;
//     }
// }