package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class ManualPlayerController extends PlayerController {

    public ManualPlayerController(int dimension, IO io) {
        super(dimension, new ManualColorCombinationController(dimension, io));
    }

    @Override
    public Combination generateColorCombination() {
        return this.getColorCombinationController().generateColorCombination();
    }


}
