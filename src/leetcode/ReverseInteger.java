package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469; //2147483647
        boolean positive = true;
        if (x<0){
            positive = false;
            x = x * (-1);
        }
        String s = Integer.toString(x);
        int[] array = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            array[i] = x % 10;
            x /= 10;
        }
        int arrayLength = s.length();
        int[] newArray = new int[arrayLength];
        int i;
        int j;
        int n;
        for (i = 0, j = arrayLength-1; i < arrayLength; i++, j--){
            newArray[j] = array[i];
        }
        long result = 0;
        for (i =arrayLength -1 , n = 0; i >= 0; --i, n++) {
            long pos = (long)Math.pow(10, i);
            result += newArray[n] * pos;
        }
        if (!positive){
            result = result * (-1);
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
          //  return 0;
        }

        System.out.println("ffffffffffff    " + result);
    }


}
