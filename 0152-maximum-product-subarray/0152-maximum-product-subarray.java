class Solution {
    public int maxProduct(int[] nums) {
        int preffix = 1;
        int suffix =1 ;
        int r = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(preffix == 0) preffix = 1 ;
            if(suffix == 0 )suffix =1 ;

            preffix *= nums[i];
            suffix *= nums[nums.length - i - 1 ];
            r =Math.max(r ,  Math.max(preffix , suffix ));
        }
        return r ;
    }
}