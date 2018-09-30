package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.controllers.ColorCombinationController;

public class Board {
    private Combination secretCode;
    private CombinationGuess combinationGuess;
    private ColorCombinationController colorCombinationController;

    public Board(ColorCombinationController colorCombinationController) {
        assert colorCombinationController != null;

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

    public void setSecretCode(Combination secretCode) {
        this.secretCode = this.colorCombinationController.generateColorCombination();
    }

    public CombinationGuess getCombinationGuess() {
        return combinationGuess;
    }
}
