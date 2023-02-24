import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    static final int INFINITE_LOOP_LIMIT = 3;

    @Test
    @Timeout(INFINITE_LOOP_LIMIT)
    void addDays() {
        Date d = new Date(2050, 2, 15);
        d.addDays(14);
        Date expected = new Date(2050, 3, 2);
        assertEquals(expected, d, "date after +14 days to 2/15/2050");
    }
}