package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.Color;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class ColorView {

    private static final char[] COLORS = { 'B', 'N', '-'};

    private Color color;

    private IO io;

    public ColorView(Color color) {
        this.color = color;
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
        return COLORS[color.ordinal()];
    }
}
