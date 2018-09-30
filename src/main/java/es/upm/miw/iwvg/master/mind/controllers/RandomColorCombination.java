package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class RandomColorCombination extends ColorCombinationController {

    public RandomColorCombination(int dimension){
        super(dimension);
    }

    @Override
    public Combination generateCombinationColor() {
        List<SecretColor> colorList = new ArrayList<>();

        for(int i = 0; i < this.getDimesion(); i++){
            colorList.add(SecretColor.random());
        }

        Combination combination = new Combination(this.getDimesion(), colorList);

        return combination;
    }
}
