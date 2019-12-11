import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число : ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Первое число " + firstNumber + " больше");
        } else if (firstNumber < secondNumber) {
            System.out.println("Второе число " + secondNumber + " больше");
        } else {
            System.out.println("Эти числа равны");
        }
// тернарный оператор
        if (firstNumber == secondNumber) {
            System.out.print("Эти числа равны");
        } else {
            //System.out.println(firstNumber > secondNumber ? "Первое число " + firstNumber + " больше" : "Второе число " + secondNumber + " больше");
            int max = firstNumber > secondNumber ? firstNumber : secondNumber;
            int min = firstNumber > secondNumber ? secondNumber : firstNumber;
            System.out.println("Число " + max + "больше " + min);
        }
    }
}
