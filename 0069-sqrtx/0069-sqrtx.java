class Solution {
    public int mySqrt(int x) {
       int l = 0 ;
       int h = x ;
       int mid = 0 ;
       long m = 0 ;
       int ans = 0 ; 
       while(l <= h){
            mid = l + ( h - l )/2 ;
            m = (long)mid * mid ;
            if(m <= x ){
                ans = mid ;
                l = mid + 1 ;
            }
            else{
                h = mid - 1 ;
            }
       }
       return ans ;  
    }
}