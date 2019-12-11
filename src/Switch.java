import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число для операции: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число для операции: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите код операции, где:");
        System.out.println("1 - сложение (первое + второе)");
        System.out.println("2 - вычитание (первое - второе)");
        System.out.println("3 - умножение (первое * второе)");
        System.out.println("4 - деление (первое / второе)");
        System.out.print("Код операции - ");
        int operationNumber = scanner.nextInt();

        switch (operationNumber) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
