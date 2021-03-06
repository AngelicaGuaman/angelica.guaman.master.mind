package es.upm.miw.iwvg.master.mind.utils;

public enum SecretColor {
    BLUE('Z'),
    GREEN('V'),
    RED('R'),
    YELLOW('A');

    private char value;

    private SecretColor(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static SecretColor random() {
        return values()[(int) (Math.random() * SecretColor.values().length)];
    }

    public static SecretColor getByValue(char value){
        for(SecretColor secretColor : values()){
            if(secretColor.getValue() == value){
                return secretColor;
            }
        }
        return null;
    }
}