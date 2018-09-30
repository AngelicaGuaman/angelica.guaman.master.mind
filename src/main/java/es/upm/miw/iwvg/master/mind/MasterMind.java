package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.*;
import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationGuess;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

public class MasterMind {

    static final int ATTEMPT = 10;
    static final int MAX_LONG_SECRET_CODE = 4;
    static final int NUMBER_PLAY_MODE = 2;

    public static void main(String[] args) {
        IO io = new IO();

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

        int i = 1;
        boolean isWinner = false;

        if (option == 1) { // partida
            io.writeln("Secreto: ****");
            PlayerController computerPlayerController = new ComputerPlayerController(MAX_LONG_SECRET_CODE, io);
            Combination secret = computerPlayerController.generateColorCombination();

            do {
                PlayerController manualPlayerController = new ManualPlayerController(MAX_LONG_SECRET_CODE, io);
                Combination guess = manualPlayerController.generateColorCombination();

                CombinationGuess combinationGuess = secret.verifySecretCode(guess);
                isWinner = combinationGuess.isWinner();

                ++i;
            } while ((i <= ATTEMPT) && !isWinner);
        } else { //demo

            PlayerController computerPlayerController1 = new ComputerPlayerController(MAX_LONG_SECRET_CODE, io);
            Combination secret = computerPlayerController1.generateColorCombination();

            do {
                PlayerController computerPlayerController2 = new ComputerPlayerController(MAX_LONG_SECRET_CODE, io);
                Combination guess = computerPlayerController2.generateColorCombination();

                CombinationGuess combinationGuess = secret.verifySecretCode(guess);
                isWinner = combinationGuess.isWinner();

                ++i;
            } while ((i <= ATTEMPT) && !isWinner);

        }

    }
}
