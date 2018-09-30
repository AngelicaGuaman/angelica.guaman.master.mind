package es.upm.miw.iwvg.master.mind.utils;

public enum Message {
    WELCOME("Bienvenido a Master Mind"),
    GAME_USER("1. Partida"),
    GAME_MACHINE("2. Demo"),
    GAME_OPTION("Opción ? "),
    MASK_SECRET("*"),
    ATTEMPT("Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul] ");

    private String message;

    private Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
