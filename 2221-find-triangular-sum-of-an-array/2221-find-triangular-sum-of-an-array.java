class Solution {
    public int triangularSum(int[] nums) {
        int num=nums.length;
        while(num>0){
            for(int i=0;i<num-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }num--;
        }return nums[0];
    }
}