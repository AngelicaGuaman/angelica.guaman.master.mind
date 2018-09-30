package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class CombinationGuess {
    private List<Color> colorList = new ArrayList<>();
    private int dimension;
    private int killed;
    private int injured;

    public CombinationGuess(int dimension, List<Color> colorList) {
        assert dimension > 0;

        this.dimension = dimension;
        this.colorList = new ArrayList<>(colorList);
        this.killed = 0;
        this.injured = 0;
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    public boolean isWinner() {
        int i = 0;

        while (this.getColorList().get(i).equals(Color.BLACK) && i < this.getDimension()) {
            i++;
        }

        return i == this.getDimension();
    }

    public int getDimension() {
        return dimension;
    }

    public int getKilled() {
        return killed;
    }

    public void setKilled(int killed) {
        this.killed = killed;
    }

    public int getInjured() {
        return injured;
    }

    public void setInjured(int injured) {
        this.injured = injured;
    }

    @Override
    public String toString() {
        return "CombinationGuess{" +
                "colorList=" + colorList +
                '}';
    }
}
