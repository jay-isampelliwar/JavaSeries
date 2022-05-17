package cp;

import java.nio.charset.IllegalCharsetNameException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DayOfTheDate {

    public static void main(String args []) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();

        LocalDate localDate = LocalDate.of(year , month , day);

//        System.out.println(localDate.getDayOfWeek());

        String date = String.valueOf(localDate.getDayOfWeek());

        System.out.println(date);
    }
}
