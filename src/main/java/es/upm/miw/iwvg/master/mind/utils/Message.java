package es.upm.miw.iwvg.master.mind.utils;

public enum Message {
    GAME_USER("1. Partida"),
    GAME_MACHINE("2. Demo"),
    GAME_OPTION("Opción ? ");

    private String message;

    private Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
