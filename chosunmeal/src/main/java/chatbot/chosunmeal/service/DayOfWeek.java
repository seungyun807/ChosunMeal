package chatbot.chosunmeal.service;

import java.util.Calendar;
import java.util.Locale;

public class DayOfWeek {
    public static int getDayOfWeek(){
        Calendar rightNow = Calendar.getInstance(Locale.KOREA);
        int day_of_week = rightNow.get(Calendar.DAY_OF_WEEK);
        return day_of_week;
    }


}
