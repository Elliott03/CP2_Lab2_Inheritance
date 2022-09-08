import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1;
    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("004", "Ash", "Johnson","Mr.", 1996, 0, 75000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1442.3076923076924, sw1.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly Salary: 1442.3076923076924", sw1.displayWeeklyPay(0));
    }
}