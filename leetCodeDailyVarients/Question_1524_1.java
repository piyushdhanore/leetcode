package leetCodeDailyVarients;

public class Question_1524_1 {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};

        System.out.println(numOfSubarrays(nums));
    }

    public static int numOfSubarrays(int[] arr) {

        final int MOD = 1_000_000_007;  // Large prime for modulo operations
        int oddCount = 0, evenCount = 1;  // evenCount starts as 1 (empty prefix)
        int sum = 0, output = 0;

        for (int num : arr) {
            sum += num;  // Update prefix sum

            if (sum % 2 == 0) {
                output = (output + oddCount) % MOD;  // Add previous odd prefix subarrays
                evenCount++;  // Increment even count
            } else {
                output = (output + evenCount) % MOD;  // Add previous even prefix subarrays
                oddCount++;  // Increment odd count
            }
        }

        return output;
    }
}
