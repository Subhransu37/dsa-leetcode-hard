class Solution {
    public void rotate(int[][] matrix) {
        int r = 0 ;
        int a = 0 ; int b = matrix.length - 1 ;

        int n = matrix.length;

        
        int top = 0, bottom = n - 1;
        while (top < bottom) {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
        for(int i = 0 ; i < matrix.length ; i++ ){
            for(int j = i +1 ; j< matrix.length ; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t ;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}