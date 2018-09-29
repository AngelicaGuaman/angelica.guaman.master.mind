package es.upm.miw.iwvg.master.mind.models;

public enum Color {
    BLUE('Z'),
    GREEN('V'),
    RED('R'),
    YELLOW('A'),
    WHITE('B'),
    BLACK('N');

    private char code;

    private Color(char code) {
        this.code = code;
    }
}