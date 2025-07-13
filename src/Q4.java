public class Q4 {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];  // note the reversed dimensions

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];   // swap row and column
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposed = transpose(original);

        System.out.println("Original Matrix:");
        printMatrix(original);

        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
}
