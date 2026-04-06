public class App {

    public static double calculateDiscount(double price, int userType, String season, int stock) {
        double discount = 0;

        // User behavior discount
        if (userType == 1) { // Premium user
            discount += 10;
        }

        // Seasonal discount
        if (season.equalsIgnoreCase("festival")) {
            discount += 15;
        }

        // Inventory-based discount
        if (stock > 100) {
            discount += 5;
        }

        // Max discount cap
        if (discount > 30) {
            discount = 30;
        }

        return price - (price * discount / 100);
    }

    public static void main(String[] args) {
        double finalPrice = calculateDiscount(1000, 1, "festival", 150);
        System.out.println("Final Price: " + finalPrice);
    }
}
