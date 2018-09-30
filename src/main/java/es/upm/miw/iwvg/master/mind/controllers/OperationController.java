package es.upm.miw.iwvg.master.mind.controllers;

public interface OperationController {

	void accept(OperationControllerVisitor operationControllerVisitor);
	
}

