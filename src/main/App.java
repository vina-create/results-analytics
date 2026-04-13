public class App {

    // Method to validate payment
    public static boolean processPayment(double amount, String cardNumber, String cvv) {

        // Basic validations
        if (amount <= 0) {
            return false;
        }

        if (cardNumber == null || cardNumber.length() != 16) {
            return false;
        }

        if (!cardNumber.matches("\\d+")) {
            return false;
        }

        if (cvv == null || cvv.length() != 3) {
            return false;
        }

        if (!cvv.matches("\\d+")) {
            return false;
        }

        // If all validations pass
        return true;
    }

    public static void main(String[] args) {
        boolean result = processPayment(1000, "1234567812345678", "123");

        if (result) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Payment Failed");
        }
    }
}