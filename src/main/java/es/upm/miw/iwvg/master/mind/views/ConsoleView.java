package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.View;
import es.upm.miw.iwvg.master.mind.controllers.ContinueController;
import es.upm.miw.iwvg.master.mind.controllers.GameController;
import es.upm.miw.iwvg.master.mind.controllers.MenuController;
import es.upm.miw.iwvg.master.mind.controllers.OperationController;

public class ConsoleView implements View {

    private GameView gameView;

    public ConsoleView() {
        gameView = new GameView();
    }

    public void interact(OperationController operationController) {
        assert operationController != null;
        operationController.accept(this);
    }

    @Override
    public void visit(MenuController menuController) {

    }

    @Override
    public void visit(GameController gameController) {

    }

    @Override
    public void visit(ContinueController continueController) {

    }
}
