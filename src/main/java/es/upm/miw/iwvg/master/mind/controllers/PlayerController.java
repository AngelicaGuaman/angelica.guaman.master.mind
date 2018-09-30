package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public abstract class PlayerController {
    private ColorCombinationController colorCombinationController;
    private int dimension;

    public PlayerController(int dimension, ColorCombinationController colorCombinationController){
        assert dimension > 0;
        assert colorCombinationController != null;

        this.dimension = dimension;
        this.colorCombinationController = colorCombinationController;
    }

    public ColorCombinationController getColorCombinationController() {
        return colorCombinationController;
    }

    public abstract Combination generateColorCombination();
}
