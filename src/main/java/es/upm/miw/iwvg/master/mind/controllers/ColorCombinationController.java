package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public abstract class ColorCombinationController {

    private int dimension;

    public ColorCombinationController(int dimesion){
        assert dimesion > 0;
        this.dimension = dimesion;
    }

    public abstract Combination generateCombinationColor();

    public int getDimesion() {
        return dimension;
    }
}
