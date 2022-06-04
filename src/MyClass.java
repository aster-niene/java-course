import java.util.Arrays;
import java.util.Random;

public class MyClass {
    public static void main(String[] args) {

      /*  Color colorl, color2; // Объявление переменной
        colorl = Color.RED;
        color2 = Color.BLACK;
        if (colorl == Color.RED) { // Проверка значения
            System.out.println("colorl == RED");
        }
        if (colorl != color2) { // Проверка значения
            System.out.println("colorl != color2");
        }
        System.out.println(colorl); // Выведет: RED
*/

/*      for (int i=0; i<20; i++){
          Random r = new Random();
          System.out.println(r.nextInt(7));
      }
*/

        int[] arr;
        arr = new int[]{1, 2, 4};
        System.out.println(Arrays.toString(arr));
        arr = new int[3];
        System.out.println(Arrays.toString(arr));
    }
}

enum Color {RED, BLUE, GREEN, BLACK}


