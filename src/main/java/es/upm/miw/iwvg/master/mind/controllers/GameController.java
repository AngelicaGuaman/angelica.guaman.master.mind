package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationResponse;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class GameController {

    private BoardController boardController;

    private PlayerController[] players;

    private ContinueController continueController;

    private MenuController menuController;

    private IO io;

    private int dimension;

    private static final int NUM_PLAYERS = 2;

    private static final int ATTEMPT = 10;

    public GameController(int dimension, IO io) {
        assert dimension > 0;
        assert io != null;

        this.dimension = dimension;
        this.io = io;
        this.players = new PlayerController[NUM_PLAYERS];
        this.boardController = new BoardController(dimension, io);
        menuController = new MenuController();
    }

    public void play() {
        int playMode = menuController.getPlayMode();

        setPlayers(playMode);
        setContinueController(playMode);

        int i = 1;
        boolean isWinner = false;

        io.writeln("\nSecreto: ****");
        Combination secret = players[0].generateColorCombination();
        //io.writeln(Message.ATTEMPT.getMessage()+combination.toString());

        do {
            Combination guess = players[1].generateColorCombination();

            CombinationResponse combinationResponse = secret.verifySecretCode(guess);
            isWinner = combinationResponse.isWinner();
            io.writeln("Código muerto/herido [N-negro, B-blanco]: " + combinationResponse.toString());

            if (!isWinner) {
                i++;
                io.writeln(String.format(Message.RESULT.getMessage(), combinationResponse.getKilled(), combinationResponse.getInjured()));
            } else {
                io.writeln(String.format(Message.WINNER.getMessage(), combinationResponse.getKilled()));
            }
        } while ((i <= ATTEMPT) && !isWinner);

        if ((i - 1) == ATTEMPT) {
            io.writeln();
            io.writeln(Message.AVAILABLE_ATTEMPT.getMessage());
            io.writeln("El código secreto era: " + secret.toString());
        }
    }

    public void setContinueController(int playMode) {
        continueController = new ManualContinueController(io);

        if (playMode == 2) {
            continueController = new ComputerContinueController(io);
        }
    }

    private void setPlayers(int option) {
        players[0] = new ComputerPlayerController(dimension, io);
        players[1] = new ComputerPlayerController(dimension, io);

        if (option == 1) {
            players[1] = new ManualPlayerController(dimension, io);
        }
    }

    public boolean continuePlaying() {
        return this.continueController.continuePlaying();
    }
}
