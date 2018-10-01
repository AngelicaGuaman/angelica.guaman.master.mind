package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.OperationController;
import es.upm.miw.iwvg.master.mind.models.Game;

public class MasterMind {

    private Logic logic;
    private View view;

    public MasterMind(View view, Logic logic){
        assert logic != null;
        assert view != null;

        this.logic = logic;
        this.view = view;
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.play();
    }

    public void play() {
        OperationController controller;
        do {
            controller = logic.getOperationController();
            if (controller != null){
                view.interact(controller);
            }
        } while (controller != null);
    }

    /*public static void main(String[] args) {
        new MasterMind(new ConsoleView(), new LocalLogic()).play();
    }*/
}
