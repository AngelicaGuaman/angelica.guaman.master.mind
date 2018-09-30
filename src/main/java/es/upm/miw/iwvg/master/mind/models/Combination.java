package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.ColorSecret;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    private List<ColorSecret> colorList = new ArrayList<>();

    public Combination(List<ColorSecret> colorList) {
        this.colorList = new ArrayList<>(colorList);
    }

    public List<ColorSecret> getColorList() {
        return colorList;
    }

    public void setColorList(List<ColorSecret> colorList) {
        this.colorList = colorList;
    }

    @Override
    public String toString() {
        return "Combination{" +
                "colorList=" + colorList +
                '}';
    }
}
