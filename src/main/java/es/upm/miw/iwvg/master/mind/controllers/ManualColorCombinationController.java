package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.Message;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class ManualColorCombinationController extends ColorCombinationController {

    public ManualColorCombinationController(int dimension) {
        super(dimension);
    }

    @Override
    public Combination generateColorCombination() {
        String guessColors;
        Combination combination;

        do {
            guessColors = this.getIo().readString("\n" + Message.ATTEMPT.getMessage()).toUpperCase();
            combination = getColorList(guessColors);
        } while (combination == null);

        return combination;
    }

    private Combination getColorList(String guessColors) {
        assert guessColors != null;
        assert guessColors.length() > 4;

        List<SecretColor> colorList = new ArrayList<>();

        for (int i = 0; i < guessColors.length(); i++) {
            SecretColor color = SecretColor.getByValue(guessColors.charAt(i));
            if (color == null) {
                return null;
            }
            colorList.add(color);
        }

        return new Combination(this.getDimension(), colorList);
    }
}
