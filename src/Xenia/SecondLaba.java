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
    private static int counterNormalEvent = 0;



    public static void main(String[] args) {



            int segments = simulationTime / 5;                                                                          //делим время симулыции на 5 равных отезков
            int timeBetweenFailures = (segments * 2) / quantityFailures;                                                // время между ошибками
            int[] failureTime = new int[quantityFailures];                                                              // создаем массив, длинной в количество ошибок
            failureTime[0] = segments * 3;                                                                              // первый элемент массива равен времен первой ошибки
            for (int i = 1; i < quantityFailures; i++) {                                                                // заполняем остальные элементы массива
                failureTime[i] = failureTime[i - 1] + timeBetweenFailures;
            }




        currentTime = getNormalEventsTime()[0];
        while (currentTime < simulationTime) {                                                                          // пока текущее время меньше времени симуляции
            if (getNormalEventsTime()[indexN] < failureTime[indexE] ) {                                                 // если ближайшее событие - положительное событие
                if (currentTime < getNormalEventsTime()[indexN]){                                                       // если текущее время - меньше времени наступления ближайшего положительного события
                    currentTime = getNormalEventsTime()[indexN];                                                        // значит перемещаем текущее время в момент наступления ближайшего положительного события
                }
                currentTime = currentTime + getTimeNormalWay();                                                         // к текущему времени прибавляем время на прохождение положительного маршрута
                indexN ++;                                                                                              // увеличиваем индекс положительных событий
                counterNormalEvent ++;                                                                                  // увеличиваем счетчик прохождения положительного маршрута
                if (currentTime > failureTime[indexE]){                                                                 // если текущее время больше чем ближайшее отрицательное событие
                    currentTime = failureTime[indexE] + getTimeFailuresWay();                                           // значит произошел сбой и текущее время теперь равно времени наступления сбоя плюс время на обработку сбоя
                    getNormalEventsTime();                                                                              // генерим заново положительные события
                    indexN = 0;                                                                                         // обнуляем индекс положительных событий
                    indexE ++;                                                                                          // увеличиваем индекс отрицательных событий
                }
            }
            else {
                currentTime = failureTime[indexE] + getTimeFailuresWay();                                               // значит произошел сбой и текущее время теперь равно времени наступления сбоя плюс время на обработку сбоя
                getNormalEventsTime();                                                                                  // генерим заново положительные события
                indexN = 0;                                                                                             // обнуляем индекс положительных событий
                indexE ++;                                                                                              // увеличиваем индекс отрицательных событий
            }



        }




    }

    private static int getTimeFailuresWay () { // время на прохождение пути после отказа
        int failuresWayOption = 1; // вызываем рендомайзер и выбираем по какому варианту пути мы идем, и обозначаем его переменной failuresWayOption пока равной 1
        int timeWay = 5; //вычисляем временную длинну, в зависимости от варианта пути путипусть пока 5
        return timeWay;
    }

    private static int getTimeNormalWay () { // время на прохождение нормального пути
        int normalWayOption = 1; // вызываем рендомайзер и выбираем по какому варианту пути мы идем, и обозначаем его переменной normalWayOption пока равной 1
        int timeWay = 5; //вычисляем временную длинну, в зависимости от варианта пути путипусть пока 5
        return timeWay;
    }





/*
    private static int[] getFailureTime(int simulationTime, int quantityFailures) {  // заполнение массива временем ошибок
        int segments = simulationTime / 5;  //делим время симулыции на 5 равных отезков
        int timeBetweenFailures = (segments * 2) / quantityFailures;  // время между ошибками
        int[] failureTime = new int[quantityFailures];  // создаем массив, длинной в количество ошибок
        failureTime[0] = segments * 3;  // первый элемент массива равен времен первой ошибки
        for (int i = 1; i < quantityFailures; i++) {  // заполняем остальные элементы массива
            failureTime[i] = failureTime[i - 1] + timeBetweenFailures;
        }
        return failureTime;  // возвращаем массив содержащий время наступления ошибки
    }

*/


    private static Integer[] getNormalEventsTime() {  // заполнение массива временем нормальных событий
        List<Integer> normalEventsTime = new ArrayList<>();
        int currentTime = 0;
        while (currentTime < simulationTime) {
            currentTime = currentTime + randomizer.nextNormalInterval();
            normalEventsTime.add(currentTime);
        }
        return normalEventsTime.toArray(new Integer[normalEventsTime.size()]);
    }




}