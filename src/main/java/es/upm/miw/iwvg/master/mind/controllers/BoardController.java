package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Board;
import es.upm.miw.iwvg.master.mind.models.Combination;

public class BoardController {

    Board board;

    public BoardController(int dimension){
        assert dimension > 0;

        board = new Board(dimension, new RandomColorCombinationController(dimension));
    }

    public void setSecretCombination(){
        board.setSecretCode();
    }

    public boolean isWinner(Combination combination){
        return board.isWinner(combination);
    }
}
