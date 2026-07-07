class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        List<Integer> ls = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                ls.add(matrix[t][i]);
            }
            t++;
            for (int i = t; i <= b; i++) {
                ls.add(matrix[i][r]);
            }
            r--;
            if(t <= b){
               for (int i = r; i >= l; i--) {
                    ls.add(matrix[b][i]);
               }
               b--;
            }

            if( l <= r) {
                for (int i = b; i >= t; i--) {
                    ls.add(matrix[i][l]);

                }
                l++;
            }

        }
        return ls ;
    }
}