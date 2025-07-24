class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != ind && max < 2 * nums[i]) {
                return -1;
            }
        }

        return ind;
    }
}