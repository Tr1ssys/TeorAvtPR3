package com.company;

public class ParseException extends Exception {

    public final int index;

    public ParseException(String message, int index) {

        super(message);

        this.index = index;
    }
    }