public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        double currBalance = 5000;
        double interestRate = 0.17;
        System.out.println("The interest due after one month is " + currBalance * interestRate);
        System.out.println("The interest due after two months is " + interestRate * (currBalance * interestRate + currBalance));
    }
}
