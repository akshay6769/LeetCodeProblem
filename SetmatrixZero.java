class SetmatrixZero {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1; // This will help in handling the first column separately.

        // Step 1: Traverse the matrix and mark the first row and column accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row:
                    matrix[i][0] = 0;

                    // Mark the j-th column:
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0; // If the zero is in the first column, mark col0 as 0.
                    }
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    // Check if the i-th row or j-th column is marked with 0:
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: Finally mark the first row and column:
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetmatrixZero solution = new SetmatrixZero();

        // Input matrix
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        // Print the original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Call the setZeroes function
        solution.setZeroes(matrix);

        // Print the modified matrix
        System.out.println("\nMatrix after setZeroes:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
