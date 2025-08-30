public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        System.out.println("What is the price of your item in dollars?");
        // this is a literal value of an example item price that they would input
        double itemPrice = 150.38;
        double SALES_TAX = 0.05;
        System.out.println("Your item price is " + itemPrice);
        System.out.println("The tax on your item in dollars will be " + (SALES_TAX * itemPrice));
        System.out.println("The total price of your item with tax is " + (SALES_TAX * itemPrice + itemPrice));
    }
}
