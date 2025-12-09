package com.eliabe.bible.domain;

public class Util {
    public static Integer strintgToInt(String text){
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
