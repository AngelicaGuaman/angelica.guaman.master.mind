package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public abstract class ColorCombinationController {

    private int dimension;

    public ColorCombinationController(int dimension){
        assert dimension > 0;
        this.dimension = dimension;
    }

    public abstract Combination generateColorCombination();

    public int getDimension() {
        return dimension;
    }
}
