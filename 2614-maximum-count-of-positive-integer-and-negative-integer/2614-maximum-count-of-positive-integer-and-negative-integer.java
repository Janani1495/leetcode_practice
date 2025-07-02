class Solution {
    public int maximumCount(int[] nums) {
        int p_c=0;int n_c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)p_c++;
            else if(nums[i]<0) n_c++;
        }return Math.max(n_c,p_c);
    }
}