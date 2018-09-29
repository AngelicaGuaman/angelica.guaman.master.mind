package es.upm.miw.iwvg.master.mind;

import es.upm.miw.iwvg.master.mind.utils.IO;

import java.util.Random;

public class MasterMind {

    public static void main(String[] args) {

        char[] secretCode = new char[4];


        IO io = new IO();

        String maquina = "ARRR";

        int i = 1;

        char[] clave = generarClave();

        do {

            System.out.println("TURNO " + i);

            //String secret = io.readString("Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,\n" +"B-blanco, N-negro]: ");

            //io.writeln(secret);


            char[] clave2 = new char[]{'A', 'R', 'R', 'R'};

            io.writeArrayChar(clave);
            io.writeArrayChar(clave2);

            int nmuertos = muertos(clave, clave2);
            System.out.println("Muertos; " + nmuertos);
            // int nheridos = heridos(clave, clave2);
            //System.out.println("Heridos: " + nheridos);

            ++i;
        } while ((i <= 10));

    }

    public static int muertos(char[] clave1, char[] clave2) {
        int a = 0;

        for (int i = 0; i < 4; i++) {
            char c2 = clave2[i];
            char c1 = clave1[i];

            if (c1 == c2) {
                a++;
            }
        }
        return a;
    }

    public static char[] generarClave() {
        char[] posiblesClaves = new char[]{'A', 'R', 'V', 'Z'};
        Random rnd = new Random();
        char[] clave = new char[4];
        int numeroRandom;
        for (int i = 0; i < clave.length; i++) {
            numeroRandom = (int) (Math.random() * posiblesClaves.length);
            clave[i] = posiblesClaves[numeroRandom];
        }
        return clave;
    }

}
