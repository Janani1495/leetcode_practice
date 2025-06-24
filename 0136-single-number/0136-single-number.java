class Solution {
    public int singleNumber(int[] nums) {
       int num=0;
        for(int i=0;i<nums.length;i++){
             int c=0;
            for(int j=0;j<nums.length;j++){
                  if(nums[i]==nums[j]&&i!=j){
                    c++;
                  }
            }if(c==0){
                num=nums[i];
                break;
            }
        }return num;
    }
}