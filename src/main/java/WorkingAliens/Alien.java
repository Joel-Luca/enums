package WorkingAliens;

import java.sql.SQLOutput;
import java.time.DayOfWeek;

public class Alien {
    //Aliens don’t work on Fridays
    private static final DayOfWeek freeDay = DayOfWeek.FRIDAY;

    public void work() {
        switch (DateUtil.getCurrentDayOfWeek()) {
            case FRIDAY:
                System.out.println("This alien is not working on Friday");
                break;
            case SATURDAY:
                System.out.println("This alien is not working on Saturday");
                break;
            case SUNDAY:
                System.out.println("Nobody is working on Sunday");
                break;
            default:
                System.out.println("this alien is now working");
        }
    }

}
