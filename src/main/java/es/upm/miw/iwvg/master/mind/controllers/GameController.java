package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationGuess;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class GameController {

    private BoardController boardController;

    private PlayerController[] players;

    private ContinueController continueController;

    private IO io;

    private int dimension;

    private static final int NUM_PLAYERS = 2;

    private static final int ATTEMPT = 10;

    private static final int MAX_LONG_SECRET_CODE = 4;

    private static final int NUMBER_PLAY_MODE = 2;

    public GameController(int dimension, IO io) {
        assert dimension > 0;
        assert io != null;

        this.dimension = dimension;
        this.io = io;
        this.players = new PlayerController[NUM_PLAYERS];

    }

    public void play() {
        int playMode = getMenuOption();

        setPlayers(playMode);
        setContinueController(playMode);

        int i = 1;
        boolean isWinner = false;

        io.writeln("Secreto: ****");
        Combination secret = players[0].generateColorCombination();

        do {
            Combination guess = players[1].generateColorCombination();

            CombinationGuess combinationGuess = secret.verifySecretCode(guess);
            isWinner = combinationGuess.isWinner();

            ++i;
        } while ((i <= ATTEMPT) && !isWinner);

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

    private int getMenuOption() {
        io.writeln();
        io.writeln();

        io.writeln(Message.WELCOME.getMessage());
        io.writeln(Message.GAME_USER.getMessage());
        io.writeln(Message.GAME_MACHINE.getMessage());

        int option;
        boolean ok;

        do {
            option = io.readInt(Message.GAME_OPTION.getMessage());
            ok = (option > 0) && (option <= NUMBER_PLAY_MODE);

            if (!ok) {
                io.writeln(Message.GAME_OPTION_ERROR.getMessage());
            }
        } while (!ok);

        return option;
    }

    public boolean continuePlaying() {
        return this.continueController.continuePlaying();
    }
}
