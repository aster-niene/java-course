import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите максимальный множитель для таблицы ");
        int range = scanner.nextInt();

        for (int i = 0; i <= range + 1; i++) {
            //ещвщ
            for (int p = 0; p <= range; p++) {
                if (p == 0) {
                    if (i == 0) {
                        System.out.printf("%10s", "Множители|");
                    } else if (i == 1) {
                        System.out.printf("%10s", "---------|");
                    } else {
                        System.out.printf("%10s", ((i - 1) + "|"));
                    }
                } else {
                    if (p % range == 0) {
                        if (i == 0) {
                            System.out.printf("%10s%n", p);
                        } else if (i == 1) {
                            System.out.printf("%10s%n", "----------");
                        } else {
                            System.out.printf("%10s%n", (p * (i - 1)));
                        }
                    } else {
                        if (i == 0) {
                            System.out.printf("%10s", p);
                        } else if (i == 1) {
                            System.out.printf("%10s", "----------");
                        } else {
                            System.out.printf("%10s", (p * (i - 1)));
                        }
                    }
                }
            }
        }
    }
}




