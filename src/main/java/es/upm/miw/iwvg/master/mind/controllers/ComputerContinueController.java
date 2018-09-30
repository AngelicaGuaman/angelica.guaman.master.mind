package es.upm.miw.iwvg.master.mind.controllers;

import es.upm.miw.iwvg.master.mind.utils.IO;

public class ComputerContinueController extends ContinueController{

    public ComputerContinueController(IO io) {
        super(io);
    }

    @Override
    public boolean continuePlaying() {
        return false;
    }
}
