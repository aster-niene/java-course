public class Function {

    public static int getSum(int x, int y){

        final int i = (3 * x) + (4 * y);
        return i;
    }

    public static double getAverage (int x, int y){
        int sum = 0;
        double count = 0;
        for (int i = x; i <= y; i++){
            sum = sum + i;
            count = count + 1;
        }
        return (double) sum / count;
    }

   /* public static int getMin (int x, int y){
        int min = 0
        if (x > y){
            min = y;
        }
        else if (x < y){
            min = x
        }
        else {
            min = x
        }
        // дописать выбор максимума, и вызвать его из кода
    }*/

    public static void main(String[] args) {
        int sum = getSum (1, 2);
        System.out.println(sum);
        int sum1 = getSum (2, 3);
        System.out.println(sum1);

        double result = getAverage(0,5);
        System.out.print (result);



    }
}
