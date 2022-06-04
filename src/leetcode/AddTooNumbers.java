package leetcode;

/*public class AddTooNumbers {


    public static int[] reverseArr(int[] arr){
        int lenArr = arr.length;
        int newArr[] = new int[lenArr];
        int i;
        int j;
        for (i = 0, j = lenArr-1; i < lenArr; i++, j--){
            newArr[j] = arr[i];
        }
        return newArr;
    }

    public static int[] intInArr (int number){
        int j = 0;
        int len = Integer.toString(number).length();
        int[] arr = new int[len];
        while(number!=0)
        {
            arr[len-j-1] = number%10;
            number = number/10;
            j++;
        }
        return arr;
    }

    public static int arrInInt (int[] arr){
        int result = 0;
        for (int i =arr.length -1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result += arr[n] * pos;
        }
        return result;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arrNewL1 = reverseArr(l11);
        int newL1 = arrInInt(arrNewL1);
        int[] arrNewL2 = reverseArr(l22);
        int newL2 = arrInInt(arrNewL2);
        int sum = newL1 + newL2;
        int[] arrSum = intInArr(sum);
        int[] newArrSum = reverseArr(arrSum);
        return newArrSum;


    }

}
*/