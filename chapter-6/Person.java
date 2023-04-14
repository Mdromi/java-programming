// java chapter-6/Person.java

public class Person {
    private String name;
    private String email;
    private int age;
    
    public Person(String name, String email, int age) {
        this(name, email);
        this.age = age;
    }
    public Person(String name, String email) {
        this(name);
        this.email = email;
    }
    public Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Romi");
        Person p2 = new Person("Md Romi", "romi@gamil.com", 23);

        System.out.println(p1.name);
        System.out.println("Name: " + p2.name);
        System.out.println("Email: " + p2.email);
        System.out.println("Age: " + p2.age);
    }
}

