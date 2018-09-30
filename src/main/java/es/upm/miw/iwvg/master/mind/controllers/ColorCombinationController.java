package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;

public abstract class ColorCombinationController {

    private IO io;
    private int dimension;

    public ColorCombinationController(int dimension, IO io){
        assert dimension > 0;
        assert io != null;

        this.dimension = dimension;
        this.io = io;
    }

    public abstract Combination generateColorCombination();

    public int getDimension() {
        return dimension;
    }

    public IO getIo() {
        return io;
    }
}
