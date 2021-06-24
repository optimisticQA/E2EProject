package OSF.naukaJava.etap2.DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
        System.out.println(sd.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.MINUTE));
    }
}
