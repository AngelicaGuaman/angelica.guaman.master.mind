package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.controllers.RandomColorCombination;
import es.upm.miw.iwvg.master.mind.models.Combination;
import es.upm.miw.iwvg.master.mind.models.CombinationGuess;
import es.upm.miw.iwvg.master.mind.utils.Color;
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

        int i = 1;
        char[] codeMachine = generateCode();
        RandomColorCombination randomColorCombination = new RandomColorCombination(MAX_LONG_SECRET_CODE);

        Combination secret = randomColorCombination.generateCombinationColor();
        List<SecretColor> colors = new ArrayList<>();
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);
        colors.add(SecretColor.BLUE);

        Combination guess = new Combination(colors);

        io.writeArrayChar(codeMachine);

        io.writeln(Message.GAME_USER.getMessage());
        io.writeln(Message.GAME_MACHINE.getMessage());
        io.readString(Message.GAME_OPTION.getMessage());

        do {

            System.out.println("TURNO " + i);

            String codeUser = io.readString("Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul] ");
            io.writeln(codeUser);

            CombinationGuess combinationGuess = guess(secret, guess);

            // int nheridos = heridos(clave, clave2);
            //System.out.println("Heridos: " + nheridos);

            ++i;
        } while ((i <= ATTEMPT));

    }

    public static CombinationGuess guess(Combination secret, Combination guess) {
        int numGuess = 0;
        List<Color> colorList = new ArrayList<>();

        for(int i = 0; i < secret.getColorList().size(); i++){
            if(guess.getColorList().get(i).getValue() == secret.getColorList().get(i).getValue()){
                colorList.add(Color.BLACK);
            } else if(secret.getColorList().contains(guess.getColorList().get(i))){
                colorList.add(Color.WHITE);
            } else{
                colorList.add(Color.EMPTY);
            }
        }

        CombinationGuess combination = new CombinationGuess(colorList);

        return combination;
    }

    public static char[] generateCode() {
        char[] possibleCode = new char[]{'A', 'R', 'V', 'Z'};
        char[] secretCode = new char[MAX_LONG_SECRET_CODE];

        for (int i = 0; i < MAX_LONG_SECRET_CODE; i++) {
            int random = (int) (Math.random() * SecretColor.values().length);
            secretCode[i] = possibleCode[random];
        }
        return secretCode;
    }

}
