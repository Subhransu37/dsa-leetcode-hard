class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0 ; 
        int h = arr.length - 1  ;
        int mid = 0 ; 
        int t = 0 ; 
        while( l <= h ){
            mid = (l + h) /2 ;
            t = arr[mid] - (mid  +1 );
            if(t < k ){
                l = mid + 1 ;
            }
            else{
                h = mid - 1 ;
            }
        }
        return k + l ; 
    }
}