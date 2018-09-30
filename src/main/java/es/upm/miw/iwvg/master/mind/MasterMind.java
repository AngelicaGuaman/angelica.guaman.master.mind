package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.RandomColorCombination;
import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationGuess;
import es.upm.miw.iwvg.master.mind.utils.SecretColor;
import es.upm.miw.iwvg.master.mind.utils.IO;
import es.upm.miw.iwvg.master.mind.utils.Message;

import java.util.ArrayList;
import java.util.List;

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

        List<SecretColor> colors = new ArrayList<>();
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);

        Combination guess = new Combination(MAX_LONG_SECRET_CODE, colors);

        RandomColorCombination randomColorCombination = new RandomColorCombination(MAX_LONG_SECRET_CODE);
        Combination secret = randomColorCombination.generateColorCombination();

        int i = 1;
        boolean isWinner = false;

        if (option == 1) { // partida
            io.writeln("Secreto: ****");

            do {
                String codeUser = io.readString(Message.ATTEMPT.getMessage());
                io.writeln(codeUser);

                CombinationGuess combinationGuess = secret.verifySecretCode(guess);
                isWinner = combinationGuess.isWinner();

                ++i;
            } while ((i <= ATTEMPT) && !isWinner);
        } else { //demo

            do {
                guess = randomColorCombination.generateColorCombination();

                String codeUser = io.readString(Message.ATTEMPT.getMessage());
                io.writeln(codeUser);

                CombinationGuess combinationGuess = secret.verifySecretCode(guess);
                isWinner = combinationGuess.isWinner();

                ++i;
            } while ((i <= ATTEMPT) && !isWinner);

        }

    }
}
