class Solution {
    public int thirdMax(int[] nums) {

        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        for (int a : nums) {

            if (a == f || a == s || a == t)
                continue;

            if (a > f) {
                t = s;
                s = f;
                f = a;
            }
            else if (a > s) {
                t = s;
                s = a;
            }
            else if (a > t) {
                t = a;
            }
        }

        return t == Long.MIN_VALUE ? (int) f : (int) t;
    }
}