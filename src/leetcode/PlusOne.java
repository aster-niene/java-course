package leetcode;

import java.math.BigInteger;

public class PlusOne {

    public static void main (String[] args){
        int[] digits = {1,2,3,4,5,6,7,8,9};
        System.out.println("after " + plusOne(digits));

    }

    public static int[] plusOne(int[] digits) {
        BigInteger result = BigInteger.valueOf(0);
        BigInteger mult = BigInteger.valueOf(10);
        BigInteger one = BigInteger.valueOf(1);
        for (int i = 0; i < digits.length; i++) {
            BigInteger number = BigInteger.valueOf(digits[i]);
            result = result.multiply(mult);
            result = result.add(number);
        }
        result = result.add(one);
        String resultPlusOneInString = result.toString();
        char[] arrChar = resultPlusOneInString.toCharArray();
        int[] newDigits = new int[resultPlusOneInString.length()];

        for (int i = 0; i < resultPlusOneInString.length(); i++){
        newDigits[i] = Character.getNumericValue(arrChar[i]);
        System.out.println(newDigits[i]);
        }
        System.out.println("before " + newDigits);
        return newDigits;
    }
}
