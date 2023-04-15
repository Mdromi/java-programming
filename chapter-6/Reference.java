// java chapter-6/Reference.java

public class Reference {
    public int x;
    public int y;

    public Reference(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Reference a;
        Reference b;
        a = new Reference(100, 200);
        b = a;

        b.x = 200;
        b.y = 200;

        System.out.println("a: " + a.x + ", " + a.y);
        System.out.println("b: " + b.x + ", " + b.y);
    }
}

