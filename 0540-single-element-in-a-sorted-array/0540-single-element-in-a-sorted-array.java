class Solution {
    public int singleNonDuplicate(int[] nums) {

        int l = 0;
        int h = nums.length - 1;

        while (l < h) {

            int mid = l + (h - l) / 2;

            // mid itself is the single element
            if (mid > 0 && mid < nums.length - 1 &&
                nums[mid] != nums[mid - 1] &&
                nums[mid] != nums[mid + 1]) {

                return nums[mid];
            }

            else {

                // mid is even
                if (mid % 2 == 0) {

                    if (nums[mid] == nums[mid + 1]) {
                        // pair is complete: [mid, mid+1]
                        l = mid + 2;
                    }
                    else {
                        // pair is broken
                        h = mid;
                    }

                }

                // mid is odd
                else {

                    if (nums[mid] == nums[mid - 1]) {
                        // pair is complete: [mid-1, mid]
                        l = mid + 1;
                    }
                    else {
                        // pair is broken
                        h = mid;
                    }
                }
            }
        }

        return nums[l];
    }
}