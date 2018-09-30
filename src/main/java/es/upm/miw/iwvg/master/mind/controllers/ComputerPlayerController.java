package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class ComputerPlayerController extends PlayerController{

    public ComputerPlayerController(int dimension, IO io) {
        super(dimension, new RandomColorCombination(dimension, io));
    }

    @Override
    public Combination generateColorCombination() {
        return this.getColorCombinationController().generateColorCombination();
    }
}
