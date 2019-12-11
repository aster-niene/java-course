import java.text.DecimalFormat;
import java.util.Scanner;

public class Investment {
    private static final int MONTHS_IN_YEAR_COUNT = 12;
    private static final int ONE_HUNDRED_PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сумму инвестирования ");
        double initialInvestment = scanner.nextInt();

        System.out.println("Введите срок инвестирования (в месяцах) ");
        int time = scanner.nextInt();

        System.out.println("Введите процентную ставку ");
        int percent = scanner.nextInt();

        double investment = initialInvestment;

        for (int i = 1; i <= time; i++){
        investment = investment + (investment*((double)percent/ONE_HUNDRED_PERCENT)/MONTHS_IN_YEAR_COUNT);
        }
        DecimalFormat f = new DecimalFormat("#.##");
        System.out.println("Сумма по вкладу, на конец инвестированя составит " + f.format(investment));
        System.out.println("Ваша чистая прибыль составит " + f.format(investment - initialInvestment));
    }
}
