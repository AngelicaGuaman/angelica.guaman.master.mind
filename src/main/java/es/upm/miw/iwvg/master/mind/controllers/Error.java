package es.upm.miw.iwvg.master.mind.controllers;

public enum Error {
    NOT_EMPTY("Esa casilla ya está ocupada"),
    NOT_PROPERTY("Esa casilla no está ocupada por ninguna de tus fichas"),
    REPEATED_COORDINATE("No se puede poner de donde se quitó");

    private String message;

    private Error(String message) {
        this.message = message;
    }
}
