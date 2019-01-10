public class Circle {
    public static void main(String[] args) {
        // Первая часть задания
        double circleRadius = 1;

        double searchSquare = calculateSquare(circleRadius);
        System.out.println("Площадь круга равна " + searchSquare);
        double circleLength = calculateCircleLength(circleRadius);
        System.out.println("Длинна окужности равна " + circleLength);

        // Вторая часть задания
        double square = 3.14;

        double radius = calculateRadius(square);
        System.out.println("Радиус круга равен " + radius);

        // Третья часть задания
        double sectorRadius = 1;
        int angle = 120;

        double squareSector = calculateSectorSquare(sectorRadius, angle);
        System.out.println("Площадь сектора равна " + squareSector);
    }

    private static double calculateSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculateCircleLength(double radius) {
        return (2 * radius * Math.PI);
    }

    private static double calculateRadius(double square) {
        return Math.sqrt(square / Math.PI);
    }

    private static double calculateSectorSquare(double sectorRadius, int angle) {
        return Math.PI * Math.pow(sectorRadius, 2) * angle / 360;
    }
}