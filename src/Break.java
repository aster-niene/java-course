import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Пароль";
        for (; ; ) {
            System.out.println("Введите слово 'Пароль'");
            String inputPassword = scanner.nextLine();
            if (password.equals(inputPassword)) {
                System.out.print("Вы ввели верный пароль");
                break;
            }
        }

    }
}
