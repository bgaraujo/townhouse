package com.home.townhouse.exception.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ExceptionMessages{
    TOWNHOUSES_NOT_FOUND("Townhouses not found"),
    ;

    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }
}
