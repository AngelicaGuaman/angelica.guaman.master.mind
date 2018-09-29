package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    private List<Color> colorList = new ArrayList<>();

    public Combination(List<Color> colorList) {
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
