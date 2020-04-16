package Xenia;

import java.util.ArrayList;
import java.util.List;

public class SecondLaba {

    private static final Randomizer randomizer = new Randomizer(60.0);
    private static int simulationTime = 1000; // время симуляции
    private static int quantityFailures = 25; // количество сбоев
    private static int currentTime = 0;
    private static int indexN = 0;
    private static int indexE = 0;
    private static int counterNormalEvent = 0;
    private static int totalRecoveryTime = 0;
    private static int totalProductiveTime = 0;
    private static int recoveryTime = 0;
    private static int downtime = 0;
    private static double probability = 0.9;
    static final double timeActions = 6.3;
    private static Integer[] masNormalEventsTime = getNormalEventsTime();

    public static void main(String[] args) {
        int segments = simulationTime / 5;
        int timeBetweenFailures = (segments * 2) / quantityFailures;
        int[] failureTime = new int[quantityFailures];
        failureTime[0] = segments * 3;
        for (int i = 1; i < quantityFailures; i++) {
            failureTime[i] = failureTime[i - 1] + timeBetweenFailures;
        }

        currentTime = masNormalEventsTime[0];
        while (currentTime < simulationTime) {
            if (masNormalEventsTime[indexN] < failureTime[indexE]) {
                if (currentTime <= masNormalEventsTime[indexN]) {
                    downtime = masNormalEventsTime[indexN] - currentTime;
                    currentTime = masNormalEventsTime[indexN];
                }
                int timeNormalWay = getTimeNormalWay();
                currentTime = currentTime + timeNormalWay;
                indexN++;
                counterNormalEvent++;
                if (currentTime > failureTime[indexE]) {
                    recoveryTime = getTimeFailuresWay();
                    totalRecoveryTime = totalRecoveryTime + recoveryTime;
                    currentTime = failureTime[indexE] + recoveryTime;
                    masNormalEventsTime = getNormalEventsTime(currentTime);
                    indexN = 0;
                    indexE++;
                } else {
                    totalProductiveTime = totalProductiveTime + timeNormalWay;
                }
            } else {
                recoveryTime = getTimeFailuresWay();
                totalRecoveryTime = totalRecoveryTime + recoveryTime;
                currentTime = failureTime[indexE] + recoveryTime;
                masNormalEventsTime = getNormalEventsTime(currentTime);
                indexN = 0;
                indexE++;
            }
        }
        System.out.println("количество завершенных проходов равно " + counterNormalEvent);
        System.out.println("общее время востановления " + totalRecoveryTime);
        System.out.println("общее время продуктивной работы равно " + totalProductiveTime);
        System.out.println("время простоя равно " + downtime);
    }

    private static int getTimeFailuresWay() {
        int failuresWayOption = (int) (Math.random() * 4);
        int timeWay = 0;
        switch (failuresWayOption) {
            case 1:
                timeWay = getTimeActions(probability, 2);
                return timeWay;
            case 2:
                timeWay = getTimeActions(probability, 3);
                return timeWay;
            case 3:
                timeWay = getTimeActions(probability, 4);
                return timeWay;
        }
        return timeWay;
    }

    private static int getTimeNormalWay() {
        int normalWayOption = (int) (Math.random() * 4);
        int timeWay = 0;
        switch (normalWayOption) {
            case 1:
                timeWay = getTimeActions(probability, 5);
                return timeWay;
            case 2:
                timeWay = getTimeActions(probability, 9);
                return timeWay;
            case 3:
                timeWay = getTimeActions(probability, 15);
                return timeWay;
        }
        return timeWay;
    }

    private static Integer[] getNormalEventsTime() {
        return getNormalEventsTime(0);
    }

    private static Integer[] getNormalEventsTime(int startingTime) {
        List<Integer> normalEventsTime = new ArrayList<>();
        int currentTime = startingTime;
        while (currentTime < simulationTime) {
            currentTime = currentTime + randomizer.nextNormalInterval();
            normalEventsTime.add(currentTime);
        }
        return normalEventsTime.toArray(new Integer[normalEventsTime.size()]);
    }

    public static int getTimeActions(double probability, int neededActions) {
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
        return (int) totalTime;
    }

    public static boolean eventOccurrence(double probability) {
        boolean yesNo = false;
        if (Math.random() > probability) {
            yesNo = true;
        }
        return yesNo;
    }
}
