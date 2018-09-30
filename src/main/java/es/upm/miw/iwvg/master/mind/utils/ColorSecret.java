package es.upm.miw.iwvg.master.mind.utils;

public enum ColorSecret {
    BLUE('Z'),
    GREEN('V'),
    RED('R'),
    YELLOW('A'),
    WHITE('B'),
    BLACK('N');

    private char value;

    private ColorSecret(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static ColorSecret random() {
        return values()[(int) (Math.random() * ColorSecret.values().length)];
    }
}