package Xenia;

import java.util.Random;
import java.util.Scanner;

public class FirstLaba {

    static Random r = new Random();
    Scanner scanner = new Scanner(System.in);
    static double[] givenProbability = {0, 0.3, 0.6, 0.9};
    static final double timeActions = 6.3;
    static final int numberRepetitions = 50;

    public static void main(String[] args) {
        getAverageTimeActionsProbability(1);
        getAverageTimeActionsProbability(5);
        getAverageTimeActionsProbability(9);
        getAverageTimeActionsProbability(16);
    }

    public static void getAverageTimeActionsProbability(int plannedNumberActions) {
        double averageRouteTime = 0;

        for (int probabilityIndex = 0; probabilityIndex < 4; probabilityIndex++) {
            double totalTimeRoutes = 0;
            for (int j = 0; j < numberRepetitions; j++) {
                totalTimeRoutes = totalTimeRoutes + getTimeActions(givenProbability[probabilityIndex], plannedNumberActions);
            }
            averageRouteTime = totalTimeRoutes / numberRepetitions;
            System.out.println("среднее время маршрута длинною " + plannedNumberActions + " шагов, с вероятностью ошибки " + givenProbability[probabilityIndex] + " составляет " + averageRouteTime + " секунд");
        }
    }

    public static double getTimeActions(double probability, int neededActions) {
        int successActions = 0;
        int totalActions = 0;

        while (successActions < neededActions) {
            if (eventOccurrence(probability)) {
                successActions++;
            }
            totalActions++;
        }

        double totalTime = totalActions * timeActions;
        //System.out.println("totalTime = " + totalTime);
        return totalTime;
    }

    public static boolean eventOccurrence(double probability) {
        boolean yesNo = false;

        if (r.nextDouble() > probability) {
            yesNo = true;
        }
        return yesNo;
    }
}

