
// java chapter-3/UnboxingExample.java

public class UnboxingExample {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        UnboxingExample example = new UnboxingExample();

        int a = 5;
        int b = 15;
        int c = example.add(a, b);
        System.out.println("Result: " + c);
    }
}

