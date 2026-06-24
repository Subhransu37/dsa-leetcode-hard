class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i =0 ;
        int j = 1;
        int[] a = new int[nums.length];
        for(int k =0 ; k < nums.length ; k++){
            if(nums[k] > 0){
                a[i] = nums[k];
                i+=2 ;
            }
            else{
               a[j] = nums[k];
               j+=2 ;
            }
        }
        return a ;
    }
}