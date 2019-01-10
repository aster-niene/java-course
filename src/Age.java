import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 150) {
            System.out.println("Вы слишком стары");
        } else {
            System.out.print("Вам " + age);
            int lastNumber = age % 10;
            int penultNumber = (age / 10) % 10;
            if (lastNumber == 1 && penultNumber != 1) {
                System.out.println(" год");
            } else if ((lastNumber > 1 && lastNumber < 5) && penultNumber != 1) {
                System.out.println(" года");
            } else {
                System.out.println(" лет");
            }
        }
    }
}

