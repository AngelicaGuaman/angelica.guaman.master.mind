package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class MenuController {
    private static final int NUMBER_PLAY_MODE = 2;
    private IO io;

    public MenuController(){
        io = new IO();
    }

    public int getPlayMode(){

        io.writeln();
        io.writeln();

        io.writeln(Message.WELCOME.getMessage());
        io.writeln(Message.GAME_USER.getMessage());
        io.writeln(Message.GAME_MACHINE.getMessage());

        int option;
        boolean ok;

        do {
            option = io.readInt(Message.GAME_OPTION.getMessage());
            ok = (option > 0) && (option <= NUMBER_PLAY_MODE);

            if (!ok) {
                io.writeln(Message.GAME_OPTION_ERROR.getMessage());
            }
        } while (!ok);

        return option;
    }
}
