package leetcode;

public class ConcatenationArray {

    public static void main(String[] args) {
        int[] array = {3,1,2,10,1};
        ConcatenationArray getConcatenation = new ConcatenationArray();
        getConcatenation.getConcatenation(array);
    }

    public int[] getConcatenation(int[] nums) {
       // int lengthArray = nums.length;
       // int twiceLengthArray = nums.length*2;
        int answ[] = new int[nums.length*2];
        for (int i=0; i<nums.length; i++){
            answ[i] = nums [i];
            answ [i+nums.length] = nums [i];
        }
        for (int i=0; i<nums.length*2; i++){
            System.out.print(answ[i]);
        }
        return answ;
    }
}
