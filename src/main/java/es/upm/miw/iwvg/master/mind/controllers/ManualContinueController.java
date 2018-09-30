package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class ManualContinueController extends ContinueController {

    public ManualContinueController(IO io) {
        super(io);
    }

    @Override
    public boolean continuePlaying() {
        boolean playing;
        String result;

        do {
            result = this.getIo().readString(Message.CONTINUE_PLAYING.getMessage()).toUpperCase();
            playing = result.equals(Message.YES.getMessage()) || result.equals(Message.NO.getMessage());

            if (!playing) {
                this.getIo().writeln(Message.GAME_OPTION_ERROR.getMessage());
            }
        } while (!playing);

        return result.equals(Message.YES.getMessage());
    }
}
