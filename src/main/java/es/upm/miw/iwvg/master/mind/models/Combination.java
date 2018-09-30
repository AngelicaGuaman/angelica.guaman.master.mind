package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.Color;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    private List<SecretColor> colorList = new ArrayList<>();
    private int dimension;

    public Combination(int dimension, List<SecretColor> colorList) {
        assert dimension > 0;

        this.dimension = dimension;
        this.colorList = new ArrayList<>(colorList);
    }

    public List<SecretColor> getColorList() {
        return colorList;
    }

    public int getDimension() {
        return dimension;
    }

    public void setColorList(List<SecretColor> colorList) {
        this.colorList = colorList;
    }

    public CombinationGuess verifySecretCode(Combination guess) {
        List<Color> colorList = new ArrayList<>();
        CombinationGuess combinationGuess = new CombinationGuess(this.getDimension(), colorList);

        for (int i = 0; i < this.getDimension(); i++) {
            if (guess.getColorList().get(i).getValue() == this.getColorList().get(i).getValue()) {
                colorList.add(Color.BLACK);
                combinationGuess.setKilled(combinationGuess.getKilled() + 1);
            } else if (this.getColorList().contains(guess.getColorList().get(i))) {
                colorList.add(Color.WHITE);
                combinationGuess.setInjured(combinationGuess.getInjured() + 1);
            } else {
                colorList.add(Color.EMPTY);
            }
        }

        return new CombinationGuess(this.getDimension(), colorList);
    }

    @Override
    public String toString() {
        return "Combination{" +
                "colorList=" + colorList +
                '}';
    }
}
