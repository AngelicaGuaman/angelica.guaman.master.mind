package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;

public abstract class ColorCombinationController {

    private int dimesion;

    public ColorCombinationController(int dimesion){
        this.dimesion = dimesion;
    }

    public abstract Combination generateCombinationColor();

    public int getDimesion() {
        return dimesion;
    }
}
