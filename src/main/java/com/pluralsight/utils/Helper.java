package com.pluralsight.utils;

public class Helper {

    public static String redirect(String address){
        return String.format("redirect:%s.html", address);
    }

}
