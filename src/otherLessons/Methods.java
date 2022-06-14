package otherLessons;

public class Methods {

    public static void main(String[] args) {
        printMessage("Dima");
        int SquareRectangle = Square(15, 20);
        System.out.println("Square of rectangle = " + SquareRectangle);
        int SQ = SquareSquare(25);
        System.out.println("Square of square: " + SQ);
        String time;
        String timeOut = GoodBye("23.00");
        System.out.println("Bye-bye, time is " + timeOut + " o'clock!!!");
    }

    static void printMessage(String name) {
        System.out.println("hello, " + name);
    }

    static int Square(int x, int y) {
        return x * y;

    }

    static String GoodBye(String time) {
        return time;
    }

    static int SquareSquare(int c) {
        return c * c;
    }


}
