package Xenia;

import java.util.Random;
import java.util.Scanner;

public class FirstLaba {

    static Random r = new Random();
    Scanner scanner = new Scanner(System.in);
    static float givenProbabilityFirst = 0.3f;
    static float givenProbabilitySecond = 0.5f;
    static float givenProbabilityThird = 0.7f;
    static int plannedNumberActions = 0;
    static int calculatedNumberActions = 0;
    static final double timeActions = 6.3;
    static double totalTime = 0;

    public static void main(String[] args) {
        getTimeActionsProbability(5);
        getTimeActionsProbability(9);
        getTimeActionsProbability(16);
    }

    public static void getTimeActionsProbability(int plannedNumberActions) {
        System.out.println("время прохождения для вероятности 0,3 составляет: " + getTimeActions(givenProbabilityFirst, plannedNumberActions) + " секунд");
        System.out.println("время прохождения для вероятности 0,5 составляет: " + getTimeActions(givenProbabilitySecond, plannedNumberActions) + " секунд");
        System.out.println("время прохождения для вероятности 0.7 составляет: " + getTimeActions(givenProbabilityThird, plannedNumberActions) + " секунд");
    }

    public static double getTimeActions(float probability, int plannedNumberActions) {
        int i = 0;
        while (i < plannedNumberActions) {
            if (eventOccurrence(probability)) {
                calculatedNumberActions++;
                i++;
            } else {
                calculatedNumberActions++;
            }
        }
        System.out.println("количество попыток для  " + plannedNumberActions + " шагов и вероятности " + probability + ", составляет " + calculatedNumberActions);
        totalTime = calculatedNumberActions * timeActions;
        return totalTime;
    }

    public static boolean eventOccurrence(float probability) {
        boolean yesNo = false;
        double randomNumber = r.nextDouble();
        if (r.nextDouble() > probability) {
            yesNo = true;
        }
        return yesNo;
    }
}

