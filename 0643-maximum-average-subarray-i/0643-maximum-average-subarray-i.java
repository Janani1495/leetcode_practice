class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int left=0;double sum=0;double max=Double.NEGATIVE_INFINITY;double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }avg=sum/k;
       max=avg;
       for (int right = k; right < nums.length; right++){
             sum-=nums[left];
             left++;
             sum+=nums[right];
             avg=sum/k;
             max=Math.max(max,avg);      
      }
             return max;
    }
}