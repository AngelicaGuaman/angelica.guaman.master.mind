package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.controllers.GameController;
import es.upm.miw.iwvg.master.mind.utils.State;

public class Game {

    private static final int MAX_LONG_SECRET_CODE = 4;

    private State state;

    private GameController gameController;

    public Game() {

        this.state = State.INITIAL;
        gameController = new GameController(MAX_LONG_SECRET_CODE);

    }

    public void play(){
        boolean continuePlaying = true;

        do{
            gameController.play();
            continuePlaying = gameController.continuePlaying();
        }while(continuePlaying);

    }

    public State getState() {
        return state;
    }
}
