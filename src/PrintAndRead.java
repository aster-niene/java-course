import java.util.Scanner;

public class PrintAndRead {

    private static void printAndRead (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println(number);
    }

    public static void main(String[] args) {
        printAndRead();
        printAndRead();
    }
}
