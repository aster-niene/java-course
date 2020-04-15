package Xenia;


import java.util.ArrayList;
import java.util.List;

public class SecondLaba {

    private static final Randomizer randomizer = new Randomizer(60.0);
    private static int simulationTime = 1000; // время симуляции
    private static int quantityFailures = 20; // количество сбоев
    private static int currentTime = 0;
    private static int indexN = 0;
    private static int indexE = 0;
    private static int counterNormalEvent = 0;                                                                          // количество удачных проходов
    private static int totalRecoveryTime = 0;                                                                           // общее время восстановления
    private static int recoveryTime = 0;
    private static double probability = 0.6;
    static final double timeActions = 6.3;
    private static Integer[] masNormalEventsTime = getNormalEventsTime();


    public static void main(String[] args) {


        int segments = simulationTime / 5;                                                                              //делим время симулыции на 5 равных отезков
        int timeBetweenFailures = (segments * 2) / quantityFailures;                                                    // время между ошибками
        int[] failureTime = new int[quantityFailures];                                                                  // создаем массив, длинной в количество ошибок
        failureTime[0] = segments * 3;                                                                                  // первый элемент массива равен времен первой ошибки
        for (int i = 1; i < quantityFailures; i++) {                                                                    // заполняем остальные элементы массива
            failureTime[i] = failureTime[i - 1] + timeBetweenFailures;
        }





        currentTime = masNormalEventsTime[0];
        while (currentTime < simulationTime) {                                                                          // пока текущее время меньше времени симуляции
            if (masNormalEventsTime[indexN] < failureTime[indexE]) {                                                    // если ближайшее событие - положительное событие
                if (currentTime <= masNormalEventsTime[indexN]) {                                                       // если текущее время - меньше времени наступления ближайшего положительного события
                    currentTime = masNormalEventsTime[indexN];                                                          // значит перемещаем текущее время в момент наступления ближайшего положительного события
                }
                currentTime = currentTime + getTimeNormalWay();                                                         // к текущему времени прибавляем время на прохождение положительного маршрута
                indexN++;                                                                                               // увеличиваем индекс положительных событий
                counterNormalEvent++;                                                                                   // увеличиваем счетчик прохождения положительного маршрута
                if (currentTime > failureTime[indexE]) {                                                                 // если текущее время больше чем ближайшее отрицательное событие
                    recoveryTime = getTimeFailuresWay();
                    totalRecoveryTime = totalRecoveryTime + recoveryTime;
                    currentTime = failureTime[indexE] +recoveryTime;                                                    // значит произошел сбой и текущее время теперь равно времени наступления сбоя плюс время на обработку сбоя
                    masNormalEventsTime = getNormalEventsTime(currentTime);                                             // генерим заново положительные события
                    indexN = 0;                                                                                         // обнуляем индекс положительных событий
                    indexE++;                                                                                           // увеличиваем индекс отрицательных событий
                }
            } else {
                recoveryTime = getTimeFailuresWay();
                totalRecoveryTime = totalRecoveryTime + recoveryTime;
                currentTime = failureTime[indexE] + recoveryTime;                                                       // значит произошел сбой и текущее время теперь равно времени наступления сбоя плюс время на обработку сбоя
                masNormalEventsTime = getNormalEventsTime(currentTime);                                                 // генерим заново положительные события
                indexN = 0;                                                                                             // обнуляем индекс положительных событий
                indexE++;                                                                                               // увеличиваем индекс отрицательных событий
            }
        }
        System.out.println("количество завершенных проходов равно " + counterNormalEvent);
        System.out.println("общее время востановления " + totalRecoveryTime);
    }

    private static int getTimeFailuresWay() {                                                                           // время на прохождение пути после отказа
        int failuresWayOption = (int) (Math.random() * 4);                                                              // вызываем рендомайзер и выбираем по какому варианту пути мы идем
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

    private static int getTimeNormalWay() {                                                                             // время на прохождение нормального пути
        int normalWayOption = (int) (Math.random() * 4);                                                                // вызываем рендомайзер и выбираем по какому варианту пути мы идем, и обозначаем его переменной normalWayOption пока равной 1
        int timeWay = 0;
        switch (normalWayOption) {                                                                                      //вычисляем временную длинну, в зависимости от варианта
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





/*
    private static int[] getFailureTime(int simulationTime, int quantityFailures) {                                     // заполнение массива временем ошибок
        int segments = simulationTime / 5;                                                                              //делим время симулыции на 5 равных отезков
        int timeBetweenFailures = (segments * 2) / quantityFailures;                                                    // время между ошибками
        int[] failureTime = new int[quantityFailures];                                                                  // создаем массив, длинной в количество ошибок
        failureTime[0] = segments * 3;                                                                                  // первый элемент массива равен времен первой ошибки
        for (int i = 1; i < quantityFailures; i++) {                                                                    // заполняем остальные элементы массива
            failureTime[i] = failureTime[i - 1] + timeBetweenFailures;
        }
        return failureTime;                                                                                             // возвращаем массив содержащий время наступления ошибки
    }

*/

    private static Integer[] getNormalEventsTime() {                                                                    // заполнение массива временем нормальных событий
        return getNormalEventsTime(0);
    }


    private static Integer[] getNormalEventsTime(int startingTime) {                                                                    // заполнение массива временем нормальных событий
        List<Integer> normalEventsTime = new ArrayList<>();
        int currentTime = startingTime;
        while (currentTime < simulationTime) {
            currentTime = currentTime + randomizer.nextNormalInterval();
            normalEventsTime.add(currentTime);
        }
        return normalEventsTime.toArray(new Integer[normalEventsTime.size()]);
    }

    public static int getTimeActions(double probability, int neededActions) {                                           // время на определеное количество шагов, для определенной вероятности ошибки
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
