package leetcode;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(-10);
    }


    public boolean isPalindrome(int x) {
        boolean answer = true;
        if (x < 0) {
            answer = false;
        }
        else {
            String s = Integer.toString(x);
            int lengthArray = s.length();
            int[] arr = new int[lengthArray];
            for (int i = s.length() - 1; i >= 0; i--) {
                arr[i] = x % 10;
                x /= 10;
            }

            int[] newArr = new int[lengthArray];
            for (int i = 0; i < lengthArray; i++) {
                newArr[i] = arr[lengthArray - i - 1];
            }
            for (int i = 0; i < lengthArray; i++) {
                if (arr[i] != newArr[i]) {
                    answer = false;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

}
