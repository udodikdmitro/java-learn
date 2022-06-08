package firstpackage;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("hello world!!!");

        byte b = 10;
        int a = b + 23;
        short c = 200;
        long myLongValue = 1_234_567_890_987_654L;
        float myFloatValue = 23.456f;
        double myDoubleValue = 4556.789456;
        double sum = a + b + c + myLongValue + myFloatValue + myDoubleValue;
        float d = myFloatValue / 2;
        double e = 23.456;
        double f = e / 3;
        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '\u00A9';
        boolean b1 = true;
        boolean b2 = false;
        String s = "some strings" + " are good";
        System.out.println("sum = " + sum);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("short c = " + c);
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("chares = " + char1 + char2 + char3 + char4);
        System.out.println("chares:");
        System.out.println(char1 + char2 + char3 + char4);
        System.out.println("Talk me:" + s);
    }
}