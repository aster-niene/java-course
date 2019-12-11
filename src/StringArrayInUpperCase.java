import java.util.Scanner;

public class StringArrayInUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayString = new String[5];

        System.out.println("Введите массив из 5-и строк");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка № " + (i + 1));
            //arrayString[i] = scanner.nextLine().toUpperCase(); // можно было-б сразу при приеме модифицировать принимаемую строку, но в задаче говорится изменить принятую
            arrayString[i] = scanner.nextLine();
            arrayString[i] = arrayString[i].toUpperCase();
        }
        System.out.println("вы ввели: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
