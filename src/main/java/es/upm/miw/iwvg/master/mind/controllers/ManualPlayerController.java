package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public class ManualPlayerController extends PlayerController {

    public ManualPlayerController(int dimension) {
        super(dimension, new ManualColorCombinationController(dimension));
    }

    @Override
    public Combination generateColorCombination() {
        return this.getColorCombinationController().generateColorCombination();
    }


}
