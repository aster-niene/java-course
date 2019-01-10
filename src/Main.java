//чтение из файла

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {

            int numberCount = scanner.nextInt();
            double[] numbers = new double[numberCount];

            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = scanner.nextDouble();
            }
            System.out.print(Arrays.toString(numbers));
        }
    }
}

