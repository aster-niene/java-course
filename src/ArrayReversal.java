public class ArrayReversal {

    public static void main(String[] args) {
        int[] arrayNumbers = {9, 2, 4, 2};
        int[] arrayNew = new int[arrayNumbers.length];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNew[i] = arrayNumbers[arrayNumbers.length - (i + 1)];
        }
    }
}
