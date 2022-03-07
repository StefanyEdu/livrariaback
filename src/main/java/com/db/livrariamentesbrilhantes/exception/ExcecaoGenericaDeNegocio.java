package com.db.livrariamentesbrilhantes.exception;

public abstract class ExcecaoGenericaDeNegocio extends RuntimeException {
    public ExcecaoGenericaDeNegocio(String message) {
        super(message);
    }
}
