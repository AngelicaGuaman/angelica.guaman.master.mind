package es.upm.miw.iwvg.master.mind.utils;

public enum Message {
    WELCOME("Bienvenido a Master Mind"),
    GAME_USER("1. Partida"),
    GAME_MACHINE("2. Demo"),
    GAME_OPTION("Opción ? "),
    GAME_OPTION_ERROR("La opcion que ha seleccionado no es correcta. Inténtelo otra vez "),
    MASK_SECRET("*"),
    ATTEMPT("Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul] "),
    CONTINUE_PLAYING("Desea seguir jugando "),
    YES("Y"),
    NO("N"),
    AVAILABLE_ATTEMPT("Ya no tienes más intento."),
    RESULT("%d muerto/s y %d herido/s"),
    WINNER("%d muertos!!! Victoria"),
    LOSE("Has perdido!!!"),
    KILLED_INJURED("Código muerto/herido [N-negro, B-blanco]: ");

    private String message;

    private Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
