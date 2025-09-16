class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            int s2=sum-s-nums[i];
            if(s2==s){
                return i;
            }s+=nums[i];
        }return -1;
    }
}