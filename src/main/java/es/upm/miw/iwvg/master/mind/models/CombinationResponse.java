package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.ColorResponse;

import java.util.ArrayList;
import java.util.List;

public class CombinationResponse {
    private List<ColorResponse> colorResponseList;
    private int dimension;
    private int killed;
    private int injured;

    public CombinationResponse(int dimension, List<ColorResponse> colorResponseList) {
        assert dimension > 0;

        this.dimension = dimension;
        this.colorResponseList = new ArrayList<>(colorResponseList);
        this.killed = 0;
        this.injured = 0;
    }

    public List<ColorResponse> getColorResponseList() {
        return colorResponseList;
    }

    public void setColorResponseList(List<ColorResponse> colorResponseList) {
        this.colorResponseList = colorResponseList;
    }

    public boolean isWinner() {
        int i = 0;

        while (i < this.getDimension() && this.getColorResponseList().get(i).equals(ColorResponse.BLACK)) {
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
        String result = "";

        for(ColorResponse colorResponse : this.getColorResponseList()){
            result += colorResponse.getValue();
        }
        return result;
    }
}
