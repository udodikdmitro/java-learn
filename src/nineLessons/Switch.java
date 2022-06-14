package nineLessons;

public class Switch {
    public static void main(String[] args) {
        String dayOfTheWeek="Wednesday";
        switch (dayOfTheWeek.toLowerCase()) {
            case "Monday":
                System.out.println("The first working day");
                break;
            case "Tuesday":
                System.out.println("The second working day");
                break;
            case "Wednesday":
                System.out.println("The third working day");
                break;
            case "Thursday":
                System.out.println("The fourth working day");
                break;
            case "Friday":
                System.out.println("The fifth working day");
                break;
            case "Saturday":
                System.out.println("The first day off");
                break;
            case "Sunday":
                System.out.println("The second day off");
                break;

        }
    }
}
