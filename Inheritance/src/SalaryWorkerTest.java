import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("Jane", "Doe", "321", "Dr.", 1980, 0, 52000);
        assertEquals(1000.0, sw.calculateWeeklyPay(40), 0.001);
    }
}