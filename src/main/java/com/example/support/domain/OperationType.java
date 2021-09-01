package com.example.support.domain;

import java.util.Objects;

public enum OperationType {
    NEW,
    UPDATE,
    CANCEL;


    public static OperationType fromString(String value) {
        Objects.requireNonNull(value, "OperationType value can not be null");
        try {
            return OperationType.valueOf(value);
        } catch (IllegalArgumentException e) {
            throw new DomainValidationError();
        }
    }
}
