package es.upm.miw.iwvg.master.mind.controllers;

public enum Error {
    OUT_RANGE("La longitud de la combinación de colores no es válida. "),
    INVALID_COLOR("Colores no válidos. Revise la combinación de colores. ");

    private String message;

    private Error(String message) {
        this.message = message;
    }
}
