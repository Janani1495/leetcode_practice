class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        //int pair=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }int pair=0;
        for(int i=0;i<nums.length;i++){
            int ans=nums[i]-diff;
            if(list.contains(ans)){
                int val=ans-diff;
                if(list.contains(val)){
                    pair++;
                }
            }
        }return pair;
    }
}