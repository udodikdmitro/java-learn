package otherLessons;

public class Switch {
    public static void main(String[] args) {
        String dayOfTheWeek = "wednesday";
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("The first working day");
//            case "tuesday" -> System.out.println("The second working day");
//            case "wednesday" -> System.out.println("The third working day");
//            case "thursday" -> System.out.println("The fourth working day");
//            case "friday" -> System.out.println("The fifth working day");
            case "saturday" -> System.out.println("The first ay off");
            case "sunday" -> System.out.println("The second day off");
            default -> System.out.println("Wrong day of week");
        }
    }
}
