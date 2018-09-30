package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class ManualColorCombinationController extends ColorCombinationController {

    public ManualColorCombinationController(int dimension, IO io) {
        super(dimension, io);
    }

    @Override
    public Combination generateColorCombination() {
        String guessColors = this.getIo().readString(Message.ATTEMPT.getMessage()).toUpperCase();
        return getColorList(guessColors);
    }

    private Combination getColorList(String guessColors) {
        assert guessColors != null;

        List<SecretColor> colorList = new ArrayList<>();

        for (int i = 0; i < guessColors.length(); i++) {
            SecretColor color = SecretColor.valueOf(guessColors.charAt(i)+"");
            colorList.add(color);
        }

        return new Combination(this.getDimension(), colorList);
    }
}
