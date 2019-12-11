public class SortingCheck {

    private static boolean sortedByAscending(int[] array) {
        boolean arraySorted = false;
        for (int i = 1; i < array.length; i++) {
            arraySorted = (array[i-1] < array[i]);
            if (!arraySorted) {
                break;
            }
        }
        return arraySorted;
    }

    private static boolean sortedByDescending(int[] array) {
        boolean arraySorted = false;
        for (int i = 1; i < array.length; i++) {
            arraySorted = (array[i-1] > array[i]);
            if (!arraySorted) {
                break;
            }
        }
        return arraySorted;
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {10,9,8,6,5,2,1};

        if (sortedByAscending(arrayNumbers)) {
            System.out.println("Массив отсортирован по возрастанию");
            return;
        }
        if (sortedByDescending(arrayNumbers)) {
            System.out.println("Массив отсортирован по убыванию");
            return;
        }
        if (!(sortedByDescending(arrayNumbers)|| sortedByDescending(arrayNumbers))) {
            System.out.println("Массив не отсортирован");
        }
    }
}
