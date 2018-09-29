package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.models.Color;
import es.upm.miw.iwvg.master.mind.utils.IO;

public class MasterMind {

    static final int ATTEMPT = 10;
    static final int MAX_LONG_SECRET_CODE = 4;

    public static void main(String[] args) {

        IO io = new IO();

        int i = 1;
        char[] codeMachine = generateCode();
        io.writeArrayChar(codeMachine);
        do {

            System.out.println("TURNO " + i);

            String codeUser = io.readString("Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,\n" +"B-blanco, N-negro]: ");
            io.writeln(codeUser);

            int numGuess = guess(codeUser.toCharArray(), codeMachine);
            System.out.println("Muertos; " + numGuess);
            // int nheridos = heridos(clave, clave2);
            //System.out.println("Heridos: " + nheridos);

            ++i;
        } while ((i <= ATTEMPT));

    }

    public static int guess(char[] codeUser, char[] codeMachine) {
        int numGuess = 0;

        for (int i = 0; i < MAX_LONG_SECRET_CODE; i++) {
            if (codeUser[i] == codeMachine[i]) {
                numGuess++;
            }
        }
        return numGuess;
    }

    public static int guessa(char[] codeUser, char[] codeMachine) {
        int numGuess = 0;

        for (int i = 0; i < MAX_LONG_SECRET_CODE; i++) {
            if (codeUser[i] == codeMachine[i]) {
                numGuess++;
            }
        }
        return numGuess;
    }

    public static char[] generateCode() {
        char[] possibleCode = new char[]{'A', 'R', 'V', 'Z'};
        char[] secretCode = new char[MAX_LONG_SECRET_CODE];

        for (int i = 0; i < MAX_LONG_SECRET_CODE; i++) {
            int random = (int) (Math.random() * Color.values().length);
            secretCode[i] = possibleCode[random];
        }
        return secretCode;
    }

}
