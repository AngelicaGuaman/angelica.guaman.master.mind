package es.upm.miw.iwvg.master.mind.models;

public class Board {
    private Combination secretCode;
    private CombinationGuess combinationGuess;

    public Board() {

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
}
