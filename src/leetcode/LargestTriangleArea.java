package leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LargestTriangleArea {

    public static void main(String[] args) {
        int[][] array = {{0, 0}, {0, -1}, {1, 0}, {1, 5}, {4, 0}};
        LargestTriangleArea largestTriangle = new LargestTriangleArea();
        largestTriangle.largestTriangleArea(array);
    }

    public double largestTriangleArea(int[][] points) {
        int amountPoints = points.length;
        double max = 0;
        for (int i = 0; i < amountPoints - 2; i++) {
            for (int j = i + 1; j < amountPoints - 1; j++) {
                for (int f = j + 1; f < amountPoints; f++) {
                    double value = calculatingAreaTriangle(points[i], points[j], points[f]);
                    if (value - max > 0.000001) {
                        max = value;
                    }
                }
            }
        }
        BigDecimal result = new BigDecimal(max);
        BigDecimal resultScaled = result.setScale(5, RoundingMode.HALF_UP);
        System.out.println(resultScaled);
        return resultScaled.doubleValue();
    }

    private static double calculatingDistance(int[] a, int[] b) {
        int distanceX = Math.abs(a[0] - b[0]);
        int distanceY = Math.abs(a[1] - b[1]);
        double result = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
        return result;
    }

    private static double calculatingAreaTriangle(int[] a, int[] b, int[] c) {
        double sideA = calculatingDistance(b, c);
        double sideB = calculatingDistance(a, c);
        double sideC = calculatingDistance(a, b);
        double p = (sideA + sideB + sideC) / 2;
        double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return result;
    }
}
