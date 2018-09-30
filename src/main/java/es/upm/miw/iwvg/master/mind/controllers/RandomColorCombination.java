package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class RandomColorCombination extends ColorCombinationController {

    public RandomColorCombination(int dimension, IO io){
        super(dimension, io);
    }

    @Override
    public Combination generateColorCombination() {
        List<SecretColor> colorList = new ArrayList<>();

        for(int i = 0; i < this.getDimension(); i++){
            colorList.add(SecretColor.random());
        }

        return new Combination(this.getDimension(), colorList);
    }
}
