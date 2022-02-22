package com.company;

public class CustomCheckedException extends Exception{
    CustomCheckedException(String message) {
        super(message);
    }

    CustomCheckedException() {
        super();
    }
}



