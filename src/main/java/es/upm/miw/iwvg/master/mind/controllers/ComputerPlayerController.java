package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public class ComputerPlayerController extends PlayerController{

    public ComputerPlayerController(int dimension, ColorCombinationController colorCombinationController) {
        super(dimension, colorCombinationController);
    }

    @Override
    public Combination generateColorCombination() {
        return this.getColorCombinationController().generateColorCombination();
    }


}
