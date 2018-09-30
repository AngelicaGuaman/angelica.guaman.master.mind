package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class CombinationGuess {
    private List<Color> colorList = new ArrayList<>();

    private int dimension;

    public CombinationGuess(int dimension, List<Color> colorList) {
        assert dimension > 0;
        assert !colorList.isEmpty();

        this.dimension = dimension;
        this.colorList = new ArrayList<>(colorList);
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    public boolean isWinner(){
        int i = 0;

        while(this.getColorList().get(i).equals(Color.BLACK) && i < this.getDimension()){
            i++;
        }

        return i == this.getDimension();

    }

    public int getDimension() {
        return dimension;
    }

    @Override
    public String toString() {
        return "CombinationGuess{" +
                "colorList=" + colorList +
                '}';
    }
}
