package com.apartment.helper;

public class IcorectInput extends RuntimeException {
    public IcorectInput(String errorMessage) {
        super(errorMessage);
    }
}
