package nineLessons;

public class whileDo {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int pyment = 10000;
        int years = 0;
        double interestRate = 0.1;

        do {
            currentBalance += pyment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println(years + " year - " + currentBalance);

        }
        while (currentBalance < finalBalance && years < 4);
    }
}
