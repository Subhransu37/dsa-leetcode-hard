class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int d = 0 ;
        int l = 1 ;
        int h = 0 ;
        int ans = 0 ;
        int sum = 0 ;
        for(int n : nums){
            if(n > h )h = n;
        }
        while( l <=  h ){
            sum = 0 ;
            d = l + (h - l) / 2 ;
            for(int m : nums){
                sum += (m  + d - 1 )/d;
            }
            if(sum <= threshold){
                ans =  d ;
                h = d  - 1   ;
            }
            else{ l = d + 1  ;}
        }
        return ans;
    }
}