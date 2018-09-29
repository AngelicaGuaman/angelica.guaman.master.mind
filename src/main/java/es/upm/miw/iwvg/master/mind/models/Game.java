package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.utils.State;

public class Game {

    private State state;

    private Board board;

    private static final int NUM_PLAYERS = 2;

    public Game() {
        state = State.INITIAL;
    }

    public State getState() {
        return state;
    }

    public Board getBoard() {
        return board;
    }
}
