class Solution {
    public int maximizeGreatness(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 0, count = 0;

        while (i < n && j < n) {
            if (nums[j] > nums[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}