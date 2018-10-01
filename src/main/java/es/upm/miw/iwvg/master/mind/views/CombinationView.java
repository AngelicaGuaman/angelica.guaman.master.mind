package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

public class CombinationView {

    private Combination combination;

    private IO io;

    public CombinationView(Combination combination) {
        this.combination = combination;
        io = new IO();
    }

    void write(String title) {
        String result = "";

        for (SecretColor secretColor : combination.getColorList()) {
            result += secretColor.getValue();
        }

        io.writeln(title + result);
    }

    void read(String title) {
        io.readString(title);
    }
}
