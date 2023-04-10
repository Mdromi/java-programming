// java chapter-3/AutoboxingExample.java

public class AutoboxingExample {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    public static void main(String[] args) {
        AutoboxingExample example = new AutoboxingExample();

        int a = 5;
        int b = 15;
        int c = example.add(a, b);
        System.out.println("Result: " + c);
    }
}


