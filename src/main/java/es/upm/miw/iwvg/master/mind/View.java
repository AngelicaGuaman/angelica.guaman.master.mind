package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.OperationController;
import es.upm.miw.iwvg.master.mind.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
