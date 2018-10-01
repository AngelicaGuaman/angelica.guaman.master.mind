package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.View;
import es.upm.miw.iwvg.master.mind.controllers.ContinueController;
import es.upm.miw.iwvg.master.mind.controllers.GameController;
import es.upm.miw.iwvg.master.mind.controllers.MenuController;
import es.upm.miw.iwvg.master.mind.controllers.OperationController;

public class ConsoleView implements View {

    private MenuView menuView;

    private GameView gameView;

    private ContinueView continueView;

    public ConsoleView() {
        menuView = new MenuView();
        gameView = new GameView();
        continueView = new ContinueView();
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
        continueView.interact(continueController);
    }
}
