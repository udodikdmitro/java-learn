package otherLessons;

public class IfElse {
    public static void main(String[] args) {
        int i = 10;
        {
            int k = 15;
            System.out.println("i = " + i);
            System.out.println("K = " + k);

        }
//        the if condition applies to the first line of output, or use {}
        int testScore = 7;
        System.out.println("You've got");
        if (testScore >= 90) {
            System.out.println("an excellent");
        } else if (testScore >= 70) {
            System.out.println("a good");
        } else if (testScore >= 50) {
            System.out.println("a satisfactory");
        } else {
            System.out.println("a bad");
        }
        System.out.println("mark");
    }
}
