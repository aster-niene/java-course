import java.util.Scanner;

public class ConversionTemperature {
    private static final int CONSTANT_FACTOR = 5 / 9;
    private static final int CONSTANT_COEFITIENT = 32;
    private static final int CONSTANT_KELVIN = 273;

    private static int getTemperaturePharyngate(int temperature) {
        return (CONSTANT_FACTOR * temperature) + CONSTANT_COEFITIENT;
    }

    private static int getTemperatureKelvin(int temperature) {
        return temperature - CONSTANT_KELVIN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах цельсия");
        int temperatureCelsius = scanner.nextInt();

        System.out.println("Введенная температура в градусах Фарингейта = " + getTemperaturePharyngate(temperatureCelsius));
        System.out.println("Введенная температура в градусах Кельвина" + getTemperatureKelvin(temperatureCelsius));
    }
}




