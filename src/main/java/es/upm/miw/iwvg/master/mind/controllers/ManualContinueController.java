package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.Message;
import es.upm.miw.iwvg.master.mind.utils.YesNoDialog;

public class ManualContinueController extends ContinueController {

    private YesNoDialog yesNoDialog;

    public ManualContinueController() {
        this.yesNoDialog = new YesNoDialog(Message.CONTINUE_PLAYING.getMessage());
    }

    @Override
    public boolean continuePlaying() {
        boolean playing;

        do {
            playing = yesNoDialog.read();

            if (!playing) {
                this.getIo().writeln(Message.GAME_OPTION_ERROR.getMessage());
            }
        } while (!playing);

        return playing;
    }
}
