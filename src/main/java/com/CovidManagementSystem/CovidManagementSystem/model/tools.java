package com.CovidManagementSystem.CovidManagementSystem.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tools {

    public static  Boolean validDate(String date){
        //try setting the String to a date format. If succeeded - date is valid.
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            Date validDate = sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
