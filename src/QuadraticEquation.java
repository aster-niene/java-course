import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэфициенты для уравнения вида: ax*x + bx + c = 0");
        System.out.print("Введите первый коэфициент \na = ");
        int a = scanner.nextInt();
        System.out.print("Введите второй коэфициент \nb = ");
        int b = scanner.nextInt();
        System.out.print("Введите третий коэфициент \nc = ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Х принимает любое значение");
            } else {
                float x = (float) (c / b) * (-1);
                System.out.print("Х равен " + x);
            }
        } else {
            double d = (b * b) - (4 * a * c);
            if (d < 0) {
                System.out.println("Корней нет");
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
}
