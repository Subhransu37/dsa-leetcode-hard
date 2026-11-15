class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  r = matrix.length - 1;
        int c = matrix[0].length-1 ;

        int tr = 0 ; int br = r ; int mid = 0 ;int  ansrow  = -1 ;

        while(tr <= br){
            mid = tr +(br - tr)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][c]){
                ansrow = mid;
                break;
            }
            else if(target >= matrix[mid][c])tr  = mid + 1 ;
            else{br = mid - 1 ;}
        }
        if(ansrow == -1)return false;

        mid = 0 ;
        int s = 0 ;
        int e  = c ;
        while(s <= e ){
            mid = s + (e -s )/2;
            if(matrix[ansrow][mid] == target){
                return true;
            }
            else if(matrix[ansrow][mid] > target){
                e  = mid - 1 ;
            }
            else{
                s = mid  + 1 ;
            }
        }
        return false ;
    }
}