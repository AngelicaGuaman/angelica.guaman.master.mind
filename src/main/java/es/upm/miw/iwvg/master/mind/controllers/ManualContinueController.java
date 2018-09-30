package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class ManualContinueController extends ContinueController{

    public ManualContinueController(IO io) {
        super(io);
    }

    @Override
    public boolean isContinuePlaying() {
        String result = this.getIo().readString(Message.CONTINUE_PLAYING.toString()).toUpperCase();
        return result.equals("Y");
    }
}
