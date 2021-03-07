package LeetCodeAlgorithms;

public class EvenNumbersOfDigits {
    // Retorna a quantidade de números que possuem número par de dígitos
    public static int findNumbers(int[] nums) {
        int evenDigitNumbers = 0;
        for (int n : nums) {
            int length = 0;
            int temp = 1;
            while(temp <= n) {
                length++;
                temp *= 10;
            }
            if (length % 2 == 0 && n != 0){
                evenDigitNumbers++;
            }
        }
        return evenDigitNumbers;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1000000;
        nums[1] = 901;
        nums[2] = 482123;
        nums[3] = 1771;

        Integer numbers = findNumbers(nums);
        System.out.println(numbers);

    }
}