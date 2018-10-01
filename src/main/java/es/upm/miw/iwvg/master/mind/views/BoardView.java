package es.upm.miw.iwvg.master.mind.views;

import es.upm.miw.iwvg.master.mind.controllers.PresenterController;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class BoardView {

    private PresenterController controller;

    public BoardView(PresenterController controller) {
        assert controller != null;

        this.controller = controller;
    }

    void write(){
        IO io = new IO();
        io.writeln(String.format(Message.RESULT.getMessage(), controller.getKilled(), controller.getInjured()));
    }
}
