import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "Пароль";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово 'Пароль'");
        String inputPassword = scanner.nextLine();

        if (password.equals(inputPassword)) {
            System.out.print("Вы ввели верный пароль");
        } else {
            int inputPasswordLength = inputPassword.length();
            int passwordLength = password.length();
            if (inputPasswordLength > passwordLength) {
                System.out.print("Вы ввели слишком длинный пароль");
            } else if (inputPasswordLength < passwordLength) {
                System.out.print("Вы введи слишком короткий пароль");
            } else {
                System.out.print("Вы ввели не верный пароль");
            }
        }
    }
}


