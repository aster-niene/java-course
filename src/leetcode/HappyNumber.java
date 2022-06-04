package leetcode;

public class HappyNumber {


    public static void main(String[] args) {
        int n = 20;
        boolean happy;
        happy = isHappy(n);


        System.out.println(Integer.toString(n).length());

    }

    public static boolean isHappy(int n) {
        boolean isHappy = false;
        //int oldInt = n;

        int newInt = n;
        //loop(n, isHappy);
        System.out.println(calculateNewNamber(newInt));

        return isHappy;


    }

    public static void loop(int number, boolean isHappy){
        if(number ==1){
            isHappy = true;
            System.out.println(isHappy);
        }
        else{
            number = calculateNewNamber(number);
            loop(number, isHappy);
        }
    }

    private static int calculateNewNamber(int number) {
        int newNumber = 0;
        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
            newNumber = newNumber + (arr[i] * arr[i]);
        }
        return newNumber;
    }
}



