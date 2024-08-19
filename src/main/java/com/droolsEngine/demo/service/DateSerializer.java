package com.droolsEngine.demo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSerializer
{
    public static LocalDateTime serializeDate(String date)
    {
        LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        return dateTime;
    }
}
