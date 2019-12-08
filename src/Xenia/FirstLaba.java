package Xenia;

import java.util.Random;
import java.util.Scanner;

public class FirstLaba {

    static Random r = new Random();
    Scanner scanner = new Scanner(System.in);
    boolean eventOccurrence = true;
    static float givenProbabilityFirst = 0.3f;
    static float givenProbabilitySecond = 0.5f;
    static float givenProbabilityThird = 0.7f;
    int plannedNumberActions = 0;
    static int calculatedNumberActions = 0;

    public static void main(String[] args) {

            int i = 0;
            while (i < 10) {
                if (eventOccurrence(givenProbabilityFirst)) {
                    calculatedNumberActions++;
                    i++;
                }
                else {
                    calculatedNumberActions ++;
                }
            }
        System.out.println("количество попыток: " + calculatedNumberActions);
    }


    public static boolean eventOccurrence (float probability){
        boolean yesNo = false;
        double randomNumber = r.nextDouble();
       // System.out.println("вычесленная вероятность = " + randomNumber);
        if (r.nextDouble() > probability){
            yesNo = true;
        }
       // System.out.println("Попытка прошла: " + yesNo);
        return yesNo;
    }




}

