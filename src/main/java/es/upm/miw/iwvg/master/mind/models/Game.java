package es.upm.miw.iwvg.master.mind.models;

import es.upm.miw.iwvg.master.mind.controllers.GameController;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class Game {

    GameController gameController;

    public Game(int dimension, IO io) {
        assert dimension > 0;
        assert io != null;
        gameController = new GameController(dimension, io);

    }

    public void play(){
        boolean continuePlaying = true;

        do{
            gameController.play();
            continuePlaying = gameController.continuePlaying();
        }while(continuePlaying);

    }
}
