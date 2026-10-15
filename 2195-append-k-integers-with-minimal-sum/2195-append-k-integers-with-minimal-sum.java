class Solution {
    public long suma(long a ,long b ){
        return ( a* (2 *b + a - 1)) /2 ; 
    }
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0 ;
        long s = 1 ;
        long noofinsert = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            noofinsert = nums[i] - s ;
            if(noofinsert >= 0 ){
                if(k > noofinsert)k -= noofinsert ;
                else{
                    noofinsert = k ;
                    k = 0 ; 
                }
                sum += suma(noofinsert , s) ; 
            }
            s = nums[i] + 1 ;
        }
        if(k > 0 ){
            sum += suma(k , s );
        }
        return sum ;        
    }
}