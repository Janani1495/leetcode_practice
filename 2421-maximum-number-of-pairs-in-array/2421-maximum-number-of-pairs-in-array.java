class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[]ans=new int[2];
        if(nums.length==1){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        int[]freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }int count=0;int a=0;
        for(int i=0;i<101;i++){
            if(freq[i]>0){
                count+=freq[i]/2;
                a+=freq[i]%2;
            }
        }ans[0]=count;ans[1]=a;
        return ans;
    }
}