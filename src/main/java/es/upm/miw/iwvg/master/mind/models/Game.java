package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.IO;

public class Game {

    private Board board;

    private IO io;

    private int dimension;

    private static final int NUM_PLAYERS = 2;

    private static final int ATTEMPT = 10;

    private static final int MAX_LONG_SECRET_CODE = 4;

    private static final int NUMBER_PLAY_MODE = 2;

    public Game(int dimension, IO io) {
        assert dimension > 0;
        assert io != null;

        this.dimension = dimension;
        this.io = io;
    }

    public Board getBoard() {
        return board;
    }
}
