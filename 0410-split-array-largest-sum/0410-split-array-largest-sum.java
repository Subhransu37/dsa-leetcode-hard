class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0 ;
        int e = 0 ;
        for(int i : nums){
            s = Math.max(s , i);
            e  += i ;
        }
        int mid = 0  ;
        int  sum = 0 ;
        int l = 1 ;
        int ans = 0 ;
        while(s <= e){
            l = 1 ;
            sum = 0 ;
            mid = s + (e -s  )/2;
            for(int p : nums){
                if(sum + p <= mid){
                    sum += p ;
                }
                else{
                    l ++ ;
                    sum = p ; 
                }
            }
            if(l <= k ){
                ans = mid;
                e  = mid  - 1 ;
            }
            else{
                s = mid + 1 ;
            }
        }
        return ans ;
    }
}