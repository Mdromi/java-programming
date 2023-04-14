// java chapter-6/Student.java

public class Student {
    private final String name;
    private final double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public double average() {
        return totalMarks() / marks.length;
    }

    public double totalMarks() {
        double totalMarks = 0.0;
        for(double mark: marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    public static void main(String[] args) {
        Student inaiya = new Student("Inaiya", new double[]{97.45, 95.75, 100});
        double totalMarks = inaiya.totalMarks();
        double average = inaiya.average();

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average = " + average);
    }
}

