package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class RandomColorCombinationController extends ColorCombinationController {

    public RandomColorCombinationController(int dimension){
        super(dimension);
    }

    @Override
    public Combination generateColorCombination() {
        List<SecretColor> colorList = new ArrayList<>();

        for(int i = 0; i < this.getDimension(); i++){
            colorList.add(SecretColor.random());
        }

        Combination combination = new Combination(this.getDimension(), colorList);
        return combination;
    }
}
