package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.List;

public class CombinationView {

    private List<SecretColor> secretColorList;

    private IO io;

    public CombinationView(List<SecretColor> secretColorList) {
        this.secretColorList = secretColorList;
        io = new IO();
    }

    void write(String title) {
        String result = "";

        for(SecretColor secretColor : secretColorList){
            result += secretColor.getValue();
        }

        io.writeln(result);
    }
}
