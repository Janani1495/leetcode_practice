class Solution {
    public int findMin(int[] nums) {
        // List<Integer>list=new ArrayList<>();
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }if(nums[0]>0){
        //     k=nums[0];
        // }
        // else{
        //     int max=0;
        //     for(int i=0;i<nums.length;i++){
        //         if(max<nums[i]){
        //             max=nums[i];
        //         }
        //     }k=max;
        // }Collections.rotate(list,-1*k%nums.length);
        // System.out.print(list);
        // return 0;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }return min;
    }
}