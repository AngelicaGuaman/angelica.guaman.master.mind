package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;

public abstract class ContinueController {
    private IO io;

    public ContinueController(IO io){
        assert io != null;

        this.io = io;
    }

    public abstract boolean isContinuePlaying();

    public IO getIo() {
        return io;
    }
}
