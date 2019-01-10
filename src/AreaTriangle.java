import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите координаты Х, для точки А");
        double xA = scanner.nextDouble();
        System.out.println("Введите координаты У, для точки А");
        double yA = scanner.nextDouble();
        System.out.println("Ведите координаты Х, для точки В");
        double xB = scanner.nextDouble();
        System.out.println("Введите координаты У, для точки В");
        double yB = scanner.nextDouble();
        System.out.println("Ведите координаты Х, для точки С");
        double xC = scanner.nextDouble();
        System.out.println("Введите координаты У, для точки С");
        double yC = scanner.nextDouble();
        double epsilon = 1.0e-10;

        double difference = Math.abs(((xA - xB) * (yC - yB)) - ((xC - xB) * (yA - yB)));
        if (difference <= epsilon) {
            System.out.print("Все три точки лежат на одной прямой");
        } else {
            double lengthAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
            double lengthBC = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));
            double lengthAC = Math.sqrt(Math.pow((xA - xC), 2) + Math.pow((yA - yC), 2));
            double halfMeter = (lengthAB + lengthBC + lengthAC) / 2;
            double area = Math.sqrt(halfMeter * (halfMeter - lengthAB) * (halfMeter - lengthBC) * (halfMeter - lengthAC));
            DecimalFormat f = new DecimalFormat("#.####");
            System.out.println("Площадь веденного треугольника равна " + f.format(area));
        }
    }
}
