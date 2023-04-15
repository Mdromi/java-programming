// java chapter-6/EnumExample.java

public class EnumExample {
    public enum Day {
        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public void displayDay(Day day) {
        switch (day) {
            case SATURDAY:
                System.out.println("Its saturday! Weekend!");
                break;
        
            case FRIDAY:
                System.out.println("Its friday! Weekend!");
                break;
        
            default:
                System.out.println("Weekday!");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumExample  enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);

        Day[] values = Day.values();
        for (Day toDay : values) {
            System.out.println(toDay);
        }
    }
}

