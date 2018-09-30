package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.ColorSecret;

import java.util.ArrayList;
import java.util.List;

public class RandomSecretColorCombination extends ColorCombinationController {

    public RandomSecretColorCombination(int dimension) {
        super(dimension);
    }

    @Override
    public Combination generateCombinationColor() {
        List<ColorSecret> colorList = new ArrayList<>();

        for (int i = 0; i < this.getDimesion(); i++) {
            colorList.add(ColorSecret.random());
        }

        Combination combination = new Combination(colorList);

        return combination;
    }
}
