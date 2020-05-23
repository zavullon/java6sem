package com.company.exceptions;

public class CatalogLoadException extends Exception {
    public CatalogLoadException() {
        super("Unable to load catalog");
    }

    public CatalogLoadException(Throwable t) {
        super("Unable to load catalog", t);
    }
}
