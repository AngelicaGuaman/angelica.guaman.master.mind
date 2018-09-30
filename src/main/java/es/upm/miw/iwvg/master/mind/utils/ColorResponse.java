package es.upm.miw.iwvg.master.mind.utils;

public enum ColorResponse {

    WHITE('B'),
    BLACK('N'),
    EMPTY('-');

    private char value;

    private ColorResponse(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

}
