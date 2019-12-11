import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэфициенты для уравнения вида: ax*x + bx + c = 0");

        System.out.println("Введите первый коэфициент");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.println("Введите второй коэфициент");
        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.println("Введите свободный член");
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("Х принимает любое значение");
                } else {
                    System.out.print("Корней нет");
                }
            } else {
                double x = -c / b;
                System.out.print("Х равен " + x);
            }
        } else {
            double d = (b * b) - (4 * a * c);
            if (d < -epsilon) {
                System.out.println("Корней нет");
            } else if (d > epsilon) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Х1 равен " + x1);
                System.out.println("Х2 равен " + x2);
            } else {
                System.out.println("Х равен" + (-b / (2 * a)));
            }
        }
    }
}
