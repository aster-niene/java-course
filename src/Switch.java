import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число для операции: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число для операции: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите код операции, где: \n 1 - сложение (первое + второе) \n 2 - вычитание (первое - второе) \n 3 - умножение (первое * второе) \n 4 - деление (первое / второе)");
        int operationNumber = scanner.nextInt();

        switch (operationNumber) {
            case 1:
                System.out.println((double) firstNumber + secondNumber);
                break;
            case 2:
                System.out.println((double) firstNumber - secondNumber);
                break;
            case 3:
                System.out.println((double) firstNumber * secondNumber);
                break;
            case 4:
                System.out.println((double) firstNumber / secondNumber);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
