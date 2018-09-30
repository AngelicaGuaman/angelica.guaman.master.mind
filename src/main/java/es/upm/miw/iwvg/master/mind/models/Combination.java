package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.ColorResponse;
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

    public CombinationResponse verifySecretCode(Combination guess) {
        assert guess != null;

        List<ColorResponse> colorResponseList = new ArrayList<>();
        CombinationResponse combinationResponse = new CombinationResponse(this.getDimension(), colorResponseList);

        for (int i = 0; i < this.getDimension(); i++) {
            if (guess.getColorList().contains(this.getColorList().get(i))) {
                if (guess.getColorList().get(i).equals(this.getColorList().get(i))) {
                    colorResponseList.add(ColorResponse.BLACK);
                    combinationResponse.setKilled(combinationResponse.getKilled() + 1);
                } else {
                    colorResponseList.add(ColorResponse.WHITE);
                    combinationResponse.setInjured(combinationResponse.getInjured() + 1);
                }
            } else {
                colorResponseList.add(ColorResponse.EMPTY);
            }
        }

        combinationResponse.setColorResponseList(colorResponseList);
        return combinationResponse;
    }

    @Override
    public String toString() {
        String result = "";

        for(SecretColor secretColor : this.getColorList()){
            result += secretColor.getValue();
        }
        return result;
    }
}
