import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testPremiumFestivalHighStock() {
        double result = App.calculateDiscount(1000, 1, "festival", 150);
        assertEquals(700, result); // 30% max discount
    }

    @Test
    void testRegularUserNoSeason() {
        double result = App.calculateDiscount(1000, 0, "normal", 50);
        assertEquals(1000, result); // No discount
    }

    @Test
    void testFestivalOnly() {
        double result = App.calculateDiscount(1000, 0, "festival", 50);
        assertEquals(850, result); // 15% discount
    }

    @Test
    void testHighStockOnly() {
        double result = App.calculateDiscount(1000, 0, "normal", 200);
        assertEquals(950, result); // 5% discount
    }
}
