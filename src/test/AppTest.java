import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAverage() {
        int[] marks = {80, 60};
        assertEquals(70.0, App.average(marks));
    }

    @Test
    void testTopper() {
        int[] marks = {80, 90};
        assertEquals(90, App.topper(marks));
    }

    @Test
    void testPerformance() {
        assertEquals("High", App.performance(80));
        assertEquals("Medium", App.performance(60));
        assertEquals("Low", App.performance(40));
    }
}