package ru.biryuchev.MyThirdTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCodes {
    EMPTY(""),
    VALIDATION_EXCEPTION("ValidationException"),
    UNSUPPORTED_EXCEPTION("UnsupportedException"),
    UNSUPPORTED_CODE_EXCEPTION("UnsupportedCodeException"),
    UNKNOWN_EXCEPTION("UnknownException");

    private final String name;

    ErrorCodes(String name) {
        this.name = name;
    }

    @JsonValue
    public String toString() {
        return name;
    }
}