package com.hkk.webdemo.utils;

import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTime {

    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.getMonthOfYear());
        System.out.println(dateTime.withTimeAtStartOfDay());
        System.out.println(cutTimeStamp(dateTime));
    }

    public static DateTime cutTimeStamp(DateTime dateTime) {
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd");
        String formatDate = format.print(dateTime);
        return format.parseDateTime(formatDate);
    }

}
