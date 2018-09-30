package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.controllers.GameController;
import es.upm.miw.iwvg.master.mind.utils.State;

public class Game {

    private State state;

    private GameController gameController;

    public Game(int dimension) {
        assert dimension > 0;

        this.state = State.INITIAL;
        gameController = new GameController(dimension);

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
