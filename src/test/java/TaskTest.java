import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @Test
    void isItAGoodRouteTest() {
        String route1 = "NNNNNNNNNN";
        assertEquals("This is a bad route", Task.isItAGoodRoute(route1));
    }

    @Test
    public void whenDateEqual_returnsTrue() {
        LocalDate date2 = new LocalDate(2022, 1, 10);
        assertEquals((new Period(LocalDate.now(), date2)), Task.howManyDays(date2));
    }
}
