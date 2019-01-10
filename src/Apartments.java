import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите количество этажей в доме: ");
        int floorsCount = scanner.nextInt();
        System.out.print("Укажите количество подъездов в доме: ");
        int entrancesCount = scanner.nextInt();
        System.out.print("Укажите номер искомой квартиры: ");
        int apartmentNumber = scanner.nextInt();
        int apartmentsOnFloorCount = 4;

        if (apartmentNumber > (floorsCount * entrancesCount * apartmentsOnFloorCount)) {
            System.out.println("Такой квартиры, в этом доме нет");
        } else {
            int foundEntrance = (int) Math.ceil((double) apartmentNumber / (floorsCount * apartmentsOnFloorCount));
            System.out.print("Ваша квартира находится в " + foundEntrance + "-м подъезде, ");

            int foundFloor = (int) Math.ceil((double) (apartmentNumber - (apartmentsOnFloorCount * floorsCount) * (foundEntrance - 1)) / apartmentsOnFloorCount);
            System.out.print("на " + foundFloor + "-м этаже, ");

            int positionApartments = apartmentNumber % apartmentsOnFloorCount;
            if (positionApartments == 0) {
                System.out.println("ближайшая справа.");
            } else if (positionApartments == 1) {
                System.out.println("ближайшая слева.");
            } else if (positionApartments == 2) {
                System.out.println("дальняя слева.");
            } else {
                System.out.println("дальняя справа.");
            }
        }
    }
}
