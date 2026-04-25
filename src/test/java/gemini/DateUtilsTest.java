package gemini;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class DateUtilsTest {

    @Test
    public void testCalculateExperience_SameDate() {
        LocalDate fromDate = LocalDate.of(2023, 1, 1);
        LocalDate toDate = LocalDate.of(2023, 1, 1);
        
        String result = DateUtils.calculateExperience(fromDate, toDate);
        
        assertEquals("0 days", result);
    }

    @Test
    public void testCalculateExperience_DaysDifference() {
        LocalDate fromDate = LocalDate.of(2023, 1, 1);
        LocalDate toDate = LocalDate.of(2023, 1, 15);
        
        String result = DateUtils.calculateExperience(fromDate, toDate);
        
        assertEquals("14 days", result);
    }

    @Test
    public void testCalculateExperience_MonthsAndDays() {
        LocalDate fromDate = LocalDate.of(2023, 1, 1);
        LocalDate toDate = LocalDate.of(2023, 3, 15);
        
        String result = DateUtils.calculateExperience(fromDate, toDate);
        
        assertEquals("2 months, 14 days", result);
    }

    @Test
    public void testCalculateExperience_YearsMonthsDays() {
        LocalDate fromDate = LocalDate.of(2020, 1, 1);
        LocalDate toDate = LocalDate.of(2023, 3, 15);
        
        String result = DateUtils.calculateExperience(fromDate, toDate);
        
        assertEquals("3 years, 2 months, 14 days", result);
    }

    @Test
    public void testCalculateExperience_SingularUnits() {
        LocalDate fromDate = LocalDate.of(2022, 1, 1);
        LocalDate toDate = LocalDate.of(2023, 2, 2);
        
        String result = DateUtils.calculateExperience(fromDate, toDate);
        
        assertEquals("1 year, 1 month, 1 day", result);
    }

    @Test
    public void testCalculateExperience_NullDates() {
        assertEquals("", DateUtils.calculateExperience(null, LocalDate.now()));
        assertEquals("", DateUtils.calculateExperience(LocalDate.now(), null));
        assertEquals("", DateUtils.calculateExperience(null, null));
    }

    @Test
    public void testCalculateExperience_FromDateAfterToDate() {
        LocalDate fromDate = LocalDate.of(2023, 1, 1);
        LocalDate toDate = LocalDate.of(2022, 1, 1);
        
        assertThrows(IllegalArgumentException.class, () -> {
            DateUtils.calculateExperience(fromDate, toDate);
        });
    }
}
