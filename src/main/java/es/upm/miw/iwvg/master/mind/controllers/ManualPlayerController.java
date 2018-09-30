package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public class ManualPlayerController extends PlayerController {

    public ManualPlayerController(int dimension, ColorCombinationController colorCombinationController) {
        super(dimension, colorCombinationController);
    }

    @Override
    public Combination generateColorCombination() {
        return null;
    }


}
