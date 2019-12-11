public class MaximumSearch {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 10, 15, 5, 6, 7, 8, 9};
        int max = 0;

        for (int e : numbers) {
            max = e > max ? e : max;
        }
        System.out.println(max);
    }
}
