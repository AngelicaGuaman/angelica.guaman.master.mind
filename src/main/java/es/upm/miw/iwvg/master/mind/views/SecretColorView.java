package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

public class SecretColorView {
    private static final char[] COLORS = { 'A', 'R', 'V', 'Z'};

    private SecretColor secretColor;

    private IO io;

    public SecretColorView(SecretColor secretColor) {
        this.secretColor = secretColor;
        io = new IO();
    }

    void write(String title) {
        io.write(title + this.toChar());
    }

    void writeln(String title) {
        this.write(title);
        io.writeln();
    }

    private char toChar() {
        return COLORS[secretColor.ordinal()];
    }

}
