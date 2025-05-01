import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {
    @Test
    public void testCalculateWeeklyPayNoOvertime() {
        Worker w = new Worker("Test", "User", "123", "Mr.", 1990, 20.0);
        assertEquals(800.0, w.calculateWeeklyPay(40), 0.001);
    }

    @Test
    public void testCalculateWeeklyPayWithOvertime() {
        Worker w = new Worker("Test", "User", "123", "Mr.", 1990, 20.0);
        assertEquals(950.0, w.calculateWeeklyPay(45), 0.001);
    }
}
