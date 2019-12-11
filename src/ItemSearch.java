import java.util.Scanner;

public class ItemSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 7, 2, 3, 7, 4, 10, 15, 5, 6, 7, 8, 7, 9};

        System.out.println("Введите искомое число");
        int soughtNumber = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++){
            if (soughtNumber == numbers[i]) {
                System.out.println("Искомое число содержится в массиве под номером: " + i);
                found = true;
            }
        }
        if (!found){
            System.out.println("Число не найденно -1");
        }
    }
}
