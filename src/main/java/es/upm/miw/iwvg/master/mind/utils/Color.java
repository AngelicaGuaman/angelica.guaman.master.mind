package es.upm.miw.iwvg.master.mind.utils;

public enum Color {

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
