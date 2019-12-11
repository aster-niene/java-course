import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите число");
        int day = scanner.nextInt();
        int maxDay = 0;
        int nextYear;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
        }
        int nextMonth;
        int nextDay;
        if ((maxDay == 0) || (day > maxDay)) {
            System.out.println("Такой даты не существует");
        } else {
            if (day == maxDay) {
                nextDay = 1;
                if (month == 12) {
                    nextMonth = 1;
                    nextYear = year + 1;
                } else {
                    nextMonth = month + 1;
                    nextYear = year;
                }
            } else {
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
            }
            String[] monthNames = {"января", "Февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
            System.out.println("Слудующая дата: " + nextDay + " " + monthNames[nextMonth - 1] + " " + nextYear);
        }
    }
}
