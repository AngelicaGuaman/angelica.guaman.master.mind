package es.upm.miw.iwvg.master.mind.controllers;


import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationResponse;

public interface PresenterController {

    CombinationResponse getCombinationResponse(Combination combination);

    int getKilled();

    int getInjured();
}
