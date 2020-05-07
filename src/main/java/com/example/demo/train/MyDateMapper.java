package com.example.demo.train;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyDateMapper {
private final String THE_FORMAT = "YYYY-MM-dd HH:mm";
private final DateTimeFormatter DATETIMEFORMATTER = DateTimeFormatter.ofPattern(THE_FORMAT);
    public LocalDateTime asLocalDateTime(String str){
        return LocalDateTime.parse(str, DATETIMEFORMATTER);
    }
    public String asString(LocalDateTime datetime){
        return datetime.format(DATETIMEFORMATTER);
    }


}
