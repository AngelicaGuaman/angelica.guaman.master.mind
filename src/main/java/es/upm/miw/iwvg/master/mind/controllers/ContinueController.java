package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;

public abstract class ContinueController {
    private IO io;

    public ContinueController(){
        this.io = new IO();
    }

    public abstract boolean continuePlaying();

    public IO getIo() {
        return io;
    }
}
