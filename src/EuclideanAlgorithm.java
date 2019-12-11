import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber % secondNumber);

        while (firstNumber != secondNumber) {
            int min = firstNumber > secondNumber ? secondNumber : firstNumber;
            int difference = Math.abs(firstNumber - secondNumber);
            firstNumber = min;
            secondNumber = difference;
        }
        System.out.println("Наибольший общий знаменатель этих чисел равен " + secondNumber);
    }
}
