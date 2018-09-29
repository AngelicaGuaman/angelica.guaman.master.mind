package es.upm.miw.iwvg.master.mind.utils;

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

    public static Color random() {
        return values()[(int) (Math.random() * Color.values().length)];
    }
}