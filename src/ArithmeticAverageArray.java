public class ArithmeticAverageArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {9, 2, 4, 2};
        int sumElements = 0;
        int quantityElements = 0;

        for (int e : arrayNumbers){
            if (e % 2 == 0 ){
                quantityElements++;
                sumElements = sumElements + e;
            }
        }
        System.out.println("Среднее арифметическое четных элементов массива: " + (double)sumElements / quantityElements);
    }
}
