package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.MenuController;
import es.upm.miw.iwvg.master.mind.controllers.OperationController;
import es.upm.miw.iwvg.master.mind.models.Game;

public class LocalLogic implements Logic {

    private Game game;
    private MenuController menuController;

    public LocalLogic(){
        game = new Game(4);
        menuController = new MenuController();
    }

    @Override
    public OperationController getOperationController() {
        switch (game.getState()){
            case INITIAL:
                //return menuController;
            default:
                return null;
        }
    }
}
