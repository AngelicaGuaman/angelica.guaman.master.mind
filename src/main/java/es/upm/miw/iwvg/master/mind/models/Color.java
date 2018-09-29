package es.upm.miw.iwvg.master.mind.models;

public enum Color {
    BLUE('Z'),
    GREEN('V'),
    RED('R'),
    YELLOW('A'),
    WHITE('B'),
    BLACK('N');

    private char value;

    private Color(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}