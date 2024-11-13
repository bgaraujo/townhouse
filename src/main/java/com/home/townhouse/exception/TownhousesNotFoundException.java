package com.home.townhouse.exception;

import static com.home.townhouse.exception.enums.ExceptionMessages.TOWNHOUSES_NOT_FOUND;

public class TownhousesNotFoundException extends RuntimeException {

    public TownhousesNotFoundException() {
        super(TOWNHOUSES_NOT_FOUND.getMessage());
    }

}
