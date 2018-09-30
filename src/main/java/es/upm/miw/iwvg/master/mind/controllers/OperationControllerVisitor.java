package es.upm.miw.iwvg.master.mind.controllers;

public interface OperationControllerVisitor {

	void visit(MenuController menuController);
	
	void visit(GameController gameController);
	
	void visit(ContinueController continueController);

}

