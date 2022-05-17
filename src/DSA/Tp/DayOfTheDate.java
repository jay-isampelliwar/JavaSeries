package Tp;

import java.util.Calendar;

public class DayOfTheDate {

    public static void main(String args []) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(2018 ,8, 5);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
