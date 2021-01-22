package WorkingAliens;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtil {
    public static DayOfWeek getCurrentDayOfWeek() {
        LocalDate now = LocalDate.now();
        DayOfWeek day = DayOfWeek.from(now);
        return day;
    }
}
