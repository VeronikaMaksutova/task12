package com.company;

public class EmptyStringException extends Exception {
    EmptyStringException(String errorMessage){
        super(errorMessage);
    }
}