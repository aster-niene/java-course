import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как тебя зовут? ");
        String name = scanner.nextLine();
        System.out.print("Привет, " + name + "!");
    }
}
