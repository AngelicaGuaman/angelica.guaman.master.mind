package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Board;
import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class BoardController {

    Board board;

    public BoardController(int dimension, IO io){
        assert dimension > 0;
        assert io != null;

        board = new Board(dimension, new RandomColorCombinationController(dimension, io));
    }

    public void setSecretCombination(){
        board.setSecretCode();
    }

    public boolean isWinner(Combination combination){
        return board.isWinner(combination);
    }
}
