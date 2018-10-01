package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.ColorResponse;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class ColorResponseView {

    private static final char[] COLORS = { 'B', 'N', '-'};

    private ColorResponse colorResponse;

    private IO io;

    public ColorResponseView(ColorResponse colorResponse) {
        this.colorResponse = colorResponse;
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
        return COLORS[colorResponse.ordinal()];
    }
}
