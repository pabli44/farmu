package com.pvelilla.farmuoperations.farmuoperations.utils;

import java.util.Arrays;
import java.util.Base64;

public class Utils {

    public static String getShortUrl(String originalURL) {
        String encodedURL = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());
        String shortURL = encodedURL.substring(0, 8);
        return shortURL;
    }


}
