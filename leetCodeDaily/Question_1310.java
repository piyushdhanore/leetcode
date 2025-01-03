package leetCodeDaily;

public class Question_1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int xorValue = 0;

            // Compute XOR from index 'left' to 'right' inclusively
            for (int j = left; j <= right; j++) {
                xorValue ^= arr[j];
            }

            result[i] = xorValue;
        }

        return result;
    }
}
