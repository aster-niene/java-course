package Xenia;

import java.util.Random;



public class Randomizer {
	private static final double  MIN_INTERVAL_SECONDS = 20.0;
    private Random random = new Random();

    private final double averageOrderInterval;
    private final double orderLambdaFactor;



    public Randomizer(double averageOrderInterval) {
     
        this.averageOrderInterval = averageOrderInterval;
        this.orderLambdaFactor = 1.0 / this.averageOrderInterval;
        
    }

    /**
     * Генерирует случайный интервал между наступлением нормальных событий.
     * Величина фильтруется так, чтобы быть больше минимального порогового значения
     * MIN_INTERVAL_SECONDS}
     *
     * @return случайное количество секунд
     */
    public int nextNormalInterval() {
        int result;
        do {
            result = (int) Math.round(getNextExponential(orderLambdaFactor));
        } while (result < MIN_INTERVAL_SECONDS);
        return result;
    }

  
    /**
     * Методом обратной функции генерирует СВ на основе базовой СВ, распределенной равномерно.
     *
     * @param lambdaFactor коэффициент лямбда
     * @return СВ
     */
    private double getNextExponential(double lambdaFactor) {
        return Math.log(1 - random.nextDouble()) / (-1 * lambdaFactor);
    }
}



