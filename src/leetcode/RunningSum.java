package leetcode;



public class RunningSum {

    public static void main(String[] args) {
        int[] array = {3,1,2,10,1};
        RunningSum runningSum = new RunningSum();
        runningSum.runningSum(array);
    }

   public int[] runningSum(int[] nums) {
        int lengthArray = nums.length;
        int answer[] = new int[nums.length];
        for (int i=0; i<lengthArray; i++){
            if (i==0){
                answer[i] = nums[i];
            }
            else {
                answer[i] = answer[i - 1] + nums[i];
            }
            System.out.println(answer[i]);
        }
        return answer;
    }


}

