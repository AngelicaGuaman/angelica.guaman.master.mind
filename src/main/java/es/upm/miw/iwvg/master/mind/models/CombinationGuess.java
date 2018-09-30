package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.Color;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class CombinationGuess {
    private List<Color> colorList = new ArrayList<>();

    public CombinationGuess(List<Color> colorList) {
        this.colorList = new ArrayList<>(colorList);
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    @Override
    public String toString() {
        return "Combination{" +
                "colorList=" + colorList +
                '}';
    }
}
