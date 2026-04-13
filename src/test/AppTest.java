import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testValidPayment() {
        assertTrue(App.processPayment(500, "1234567812345678", "123"));
    }

    @Test
    void testInvalidAmount() {
        assertFalse(App.processPayment(0, "1234567812345678", "123"));
    }

    @Test
    void testInvalidCardNumberLength() {
        assertFalse(App.processPayment(500, "1234", "123"));
    }

    @Test
    void testInvalidCardNumberCharacters() {
        assertFalse(App.processPayment(500, "1234abcd5678efgh", "123"));
    }

    @Test
    void testInvalidCVVLength() {
        assertFalse(App.processPayment(500, "1234567812345678", "12"));
    }

    @Test
    void testInvalidCVVCharacters() {
        assertFalse(App.processPayment(500, "1234567812345678", "abc"));
    }
}