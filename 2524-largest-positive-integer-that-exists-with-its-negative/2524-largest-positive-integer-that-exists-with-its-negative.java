class Solution {
    public int findMaxK(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }int max=0;
        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            if(list.contains(-1*num)){
                if(max<num){
                    max=num;
                }
            }
        }if(max>0)return max;
        return -1;
    }
}