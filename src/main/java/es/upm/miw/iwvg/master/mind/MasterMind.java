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

    public static void main(String[] args) {

        IO io = new IO();
        RandomColorCombination randomColorCombination = new RandomColorCombination(MAX_LONG_SECRET_CODE);

        Combination secret = randomColorCombination.generateCombinationColor();
        List<SecretColor> colors = new ArrayList<>();
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);

        Combination guess = new Combination(MAX_LONG_SECRET_CODE, colors);

        io.writeln(Message.WELCOME.toString());
        io.writeln(Message.GAME_USER.getMessage());
        io.writeln(Message.GAME_MACHINE.getMessage());
        io.readString(Message.GAME_OPTION.getMessage());

        int i = 1;
        boolean isWinner;

        do {
            String codeUser = io.readString(Message.ATTEMPT.getMessage());
            io.writeln(codeUser);

            CombinationGuess combinationGuess = secret.verifySecretCode(guess);
            isWinner = combinationGuess.isWinner();

            ++i;
        } while ((i <= ATTEMPT) && !isWinner);

    }
}
