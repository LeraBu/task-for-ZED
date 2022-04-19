import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.joda.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @Test
    void whenRouteEqual_returnsTrue() {
        String route1 = "NNNNNNNNNN";
        assertEquals("This is a bad route", Task.isItAGoodRoute(route1));
    }

    @Test
    void whenDateEqual_returnsTrue() {
        LocalDate date2 = new LocalDate(2022, 1, 10);
        assertEquals((new Period(LocalDate.now(), date2)), Task.howManyDays(date2));
    }
}