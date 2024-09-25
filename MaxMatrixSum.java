public class MaxMatrixSum {

    public static long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        long sum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) {
                    negCount++;
                }
                minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
            }
        }

        // If number of negative elements is even, we can make all positive
        // If odd, we need to leave the smallest absolute value as negative
        if (negCount % 2 == 0) {
            return sum;
        } else {
            return sum - 2 * minAbs;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[][] matrix1 = {{4, -8, 6}, {3, 7, 2}};
        int[][] matrix2 = {{2, 9, -5}, {6, 1, 3}, {-7, 4, 8}};
        int[][] matrix3 = {{1, -1}};
        int[][] matrix4 = {{1, 2, 3}, {-4, -5, -6}};

        System.out.println("Test Case 1: " + maxMatrixSum(matrix1)); // Expected: 26
        System.out.println("Test Case 2: " + maxMatrixSum(matrix2)); // Expected: 45
        System.out.println("Test Case 3: " + maxMatrixSum(matrix3)); // Expected: 2
        System.out.println("Test Case 4: " + maxMatrixSum(matrix4)); // Expected: 21
    }
}
