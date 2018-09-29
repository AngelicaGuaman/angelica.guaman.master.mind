package es.upm.miw.iwvg.master.mind.models;

public enum Message {
    GAME_USER("1. Partida"),
    GAME_MACHINE("2. Demo");

    private String message;

    private Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
