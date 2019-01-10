import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ChainsIf {

    public static void main(String[] args) throws FileNotFoundException {


        try (Scanner scanner = new Scanner(new FileInputStream("text.txt"))) {

            int numberCount = scanner.nextInt();
            double[] numbers = new double[numberCount];

            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = scanner.nextDouble();
            }
            System.out.print(Arrays.toString(numbers));
        }


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0) {
            System.out.print("Вы вели положительное число");
        } else if (input < 0) {
            System.out.print("Вы ввели отрицательное число");
        } else {
            System.out.print("Вы ввели ноль");
        }
    }

}
