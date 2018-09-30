package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.models.Game;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class MasterMind {

    static final int MAX_LONG_SECRET_CODE = 4;

    public static void main(String[] args) {
        IO io = new IO();
        Game game = new Game(MAX_LONG_SECRET_CODE, io);

        game.play();
    }
}
