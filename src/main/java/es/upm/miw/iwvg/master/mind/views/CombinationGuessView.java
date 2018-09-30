package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.Color;
import es.upm.miw.iwvg.master.mind.utils.IO;

import java.util.List;

public class CombinationGuessView {

    private List<Color> colorList;

    private IO io;

    public CombinationGuessView(List<Color> secretColorList) {
        this.colorList = secretColorList;
        io = new IO();
    }

    void write(String title) {
        String result = "";

        for(Color color : colorList){
            result += color.getValue();
        }

        io.writeln(result);
    }
}
