package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.controllers.ColorCombinationController;

import java.util.ArrayList;

public class Board {
    private Combination secretCode;
    private CombinationGuess combinationGuess;
    private ColorCombinationController colorCombinationController;
    private int dimension;

    public Board(int dimension, ColorCombinationController colorCombinationController) {
        assert dimension > 0;
        assert colorCombinationController != null;

        this.dimension = dimension;
        this.colorCombinationController = colorCombinationController;
    }

    public boolean isWinner(Combination combination){
        assert combination != null;
        assert !combination.getColorList().isEmpty();

        this.combinationGuess = this.getSecretCode().verifySecretCode(combination);
        return this.combinationGuess.isWinner();
    }

    public Combination getSecretCode() {
        return secretCode;
    }

    public void setSecretCode() {
        this.secretCode = this.colorCombinationController.generateColorCombination();
    }

    public int getKilled() {
        return combinationGuess.getKilled();
    }

    public int getInjured() {
        return combinationGuess.getInjured();
    }
}
