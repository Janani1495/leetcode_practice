class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer>min=new PriorityQueue<>();
        // for(int num:nums){
        //     min.add(num);
        //     if(min.size()>k){
        //         min.poll();
        //     }
        // }return min.peek();
        int[]freq=new int[200001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]+10000]++;
        }
        for(int i=20000;i>=0;i--){
           if(freq[i]>0){
            k=k-freq[i]; 
            if(k<=0){
              return i-10000;
            }
             }
           }
        return -1;
    }
}