class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2){
            if(nums[0]<nums[1]){
                return 1;
            }
        } 
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i]){
               return i;
            }
        } int n=nums.length;
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
       return 0;
        
        
    }
}