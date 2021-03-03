package AlgoritmosLeetCode;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        Integer consecutive = 0;
        Integer maxConsecutive = 0;
        for (Integer n = 0; n < nums.length; n++) {
            if (nums[n] == 1) {
                consecutive++;
                if (consecutive > maxConsecutive) {
                    maxConsecutive = consecutive;
                }
            } else {
                consecutive = 0;
            }
        }
        return maxConsecutive;
    }
}





