package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.ColorResponse;
import es.upm.miw.iwvg.master.mind.utils.IO;

import java.util.List;

public class CombinationGuessView {

    private List<ColorResponse> colorResponseList;

    private IO io;

    public CombinationGuessView(List<ColorResponse> secretColorResponseList) {
        this.colorResponseList = secretColorResponseList;
        io = new IO();
    }

    void write(String title) {
        String result = "";

        for(ColorResponse colorResponse : colorResponseList){
            result += colorResponse.getValue();
        }

        io.writeln(result);
    }
}
