public class Mass_1 {


    public static int getNamber(int search,int i, int[] array) { // вызвать функцию, ищущую число внутри массива
        if (array[i] == search) {
            return i + 1;
        } else {
            return - 1;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 8, 2, 1, 6, 8, 9, 589, 256, 9, 8, 6547, 2, 7, 65654894};
        int arraySumm = 0;
        int chek = 0;
        int search = 8;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                arraySumm = arraySumm + array[i];
                chek = chek + 1;
            }
        }
        double averageArraySumm = (double) arraySumm / chek;
        System.out.println(averageArraySumm);

        for (int i = 0; i < array.length; ++i) {
            System.out.println( getNamber(search, i, array));
        }

        String arrryString[] = {"hello", "world"};
        for (int i = 0; i < arrryString.length; ++i){
            System.out.println(arrryString[i].toUpperCase());
        }
    }

    public static int factorial(int n) {  //  рекурсия, считающая факториал "n"
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

}

