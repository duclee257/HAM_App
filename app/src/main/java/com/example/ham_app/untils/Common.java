package com.example.ham_app.untils;

import java.util.regex.Pattern;

public class Common {
    public static String baseUrl = "https://firstorangeapple41.conveyor.cloud/";
    private static final String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public static boolean patternMatches(String emailAddress) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^0\\d{9}$";
        return Pattern.matches(regex, phoneNumber);
    }
}
