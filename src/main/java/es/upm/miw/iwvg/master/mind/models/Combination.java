package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    private List<SecretColor> colorList = new ArrayList<>();

    public Combination(List<SecretColor> colorList) {
        this.colorList = new ArrayList<>(colorList);
    }

    public List<SecretColor> getColorList() {
        return colorList;
    }

    public void setColorList(List<SecretColor> colorList) {
        this.colorList = colorList;
    }

    @Override
    public String toString() {
        return "Combination{" +
                "colorList=" + colorList +
                '}';
    }
}
