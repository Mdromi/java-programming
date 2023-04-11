
// java chapter-4/Exc/Exc1.java

package Exc;

public class Exc1 {
    public static void main(String[] args) {
        int start = 65;
        int end = 70;

        for(int i = 0; i<=5; i++){
            for(int j = 0; j <= i; j++){
                // Exc 1
                // System.out.print((char) start);

                // Exc 2
                System.out.print(i+1);
            }
            start++;
            System.out.println();
        }
    }
}
