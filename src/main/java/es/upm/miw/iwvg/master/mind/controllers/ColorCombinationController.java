package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;

public abstract class ColorCombinationController {

    private int dimension;
    private IO io;

    public ColorCombinationController(int dimension) {
        assert dimension > 0;

        this.io = new IO();
        this.dimension = dimension;
    }

    public abstract Combination generateColorCombination();

    public int getDimension() {
        return dimension;
    }

    public IO getIo() {
        return io;
    }
}
