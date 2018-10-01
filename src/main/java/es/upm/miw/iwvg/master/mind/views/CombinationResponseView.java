package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.models.CombinationResponse;
import es.upm.miw.iwvg.master.mind.utils.ColorResponse;
import es.upm.miw.iwvg.master.mind.utils.IO;

import java.util.List;

public class CombinationResponseView {

    private CombinationResponse combinationResponse;

    private IO io;

    public CombinationResponseView(CombinationResponse combinationResponse) {
        this.combinationResponse = combinationResponse;
        io = new IO();
    }

    void write(String title) {
        String result = "";

        for (ColorResponse colorResponse : combinationResponse.getColorResponseList()) {
            result += colorResponse.getValue();
        }

        io.writeln(title + result);
    }
}
