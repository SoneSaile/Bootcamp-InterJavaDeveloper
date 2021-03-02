package AlgoritmosLeetCode;

import static AlgoritmosLeetCode.MaxConsecutiveOnes.findMaxConsecutiveOnes;

public class MaxConsecutiveOnesResult {
        public static void main (String[] args) {
            int[] binaryArray = new int[10];

            binaryArray[0] = 1;
            binaryArray[1] = 1;
            binaryArray[2] = 1;
            binaryArray[3] = 0;
            binaryArray[4] = 1;
            binaryArray[5] = 0;
            binaryArray[6] = 1;
            binaryArray[7] = 1;
            binaryArray[8] = 0;
            binaryArray[9] = 1;

            System.out.println(findMaxConsecutiveOnes(binaryArray));
        }
}
