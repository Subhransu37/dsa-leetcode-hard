class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int mid = 0;
        int hi = nums.length - 1 ;

        while (l <= hi) {
            mid = (l + hi) / 2;

            if (nums[mid] == target) return mid;

            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && nums[mid] >= target) {
                    hi = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[hi] >= target && nums[mid] <= target) {
                    l = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1 ;

    }
}