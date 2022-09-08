import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;
    @BeforeEach
    void setUp() {
        w1 = new Worker("001", "John", "Smith", "Mr.", 1999, 20.00);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(800, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Hours Worked of Regular Pay: 40.0\n" +
                "Money Made from Regular Pay: 800.0\n" +
                "Hours Worked of OT Pay: 0\n" +
                "Money Made From OT Pay: $0\n" +
                "Total Hours Worked: 40.0\n" +
                "Total Money Made: 800.0\n",w1.displayWeeklyPay(40));
    }
}