import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Main {


    private static double ergebnis = 0;


    public static void main(String[] args) {

        /* Taschenrechner-Anforderungen:
        - Zwei Operanden sollen in einer Zeile, durch ein Leerzeichen getrennt, eingegeben werden.
        - vier allgemeine Rechenoperationen
         */


        Scanner eingabe = new Scanner(System.in);
        boolean bool = true;
        ArrayList<Double> operanden = new ArrayList<>();

        while (bool) {


            System.out.println("Bitte geben Sie die Operanden ein (Gleitkomma, getrennt durch ein Leerzeichen)!: ");

                String operandenUndefined = eingabe.nextLine();

                String[] operandenString = operandenUndefined.split(" ");

                operanden.clear();


                for (String operand: operandenString) {
                    if (!operand.isEmpty())
                        operanden.add(parseDouble(operand));
                }

                System.out.println("Nun bitte die Rechenoperation angeben: \n a-addieren, s-subtrahieren, m-multiplizieren, d-dividieren.E für escape.");
                String operation = eingabe.nextLine();

                switch (operation) {
                    case ("a"):
                        ergebnis = operanden.get(0);
                        for (int u = 1; u < operanden.size(); u++) {
                            ergebnis += operanden.get(u);
                        }
                        System.out.println(ergebnis);
                        break;
                    case "s":
                        ergebnis = operanden.get(0);
                        for (int u = 1; u < operanden.size(); u++) {
                            ergebnis -= operanden.get(u);
                        }
                        System.out.println(ergebnis);
                        break;
                    case "m":
                        ergebnis = operanden.get(0);
                        for (int u = 1; u < operanden.size(); u++) {
                            ergebnis *= operanden.get(u);
                        }
                        System.out.println(ergebnis);
                        break;
                    case "d":
                        ergebnis = operanden.get(0);
                        for (int u = 1; u < operanden.size(); u++) {
                            ergebnis /= operanden.get(u);
                        }
                        System.out.println(ergebnis);
                        break;
                    case "E":
                        bool = false;
                        break;
                    default:
                        System.out.println("Keine gültige Eingabe.");
                        break;

                }

            }


        }
    }

